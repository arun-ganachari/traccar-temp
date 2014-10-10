-- -------------------------------------
-- Create Schema
-- -------------------------------------

CREATE DATABASE traccar_db WITH
    ENCODING = 'UTF8'
    LC_COLLATE='en_US.UTF-8'
    LC_CTYPE='en_US.UTF-8';

\c traccar_db

-- -------------------------------------
-- Create Tables
-- -------------------------------------

CREATE TABLE application_settings (
    id BIGSERIAL,
    registrationenabled BOOLEAN NOT NULL
);

CREATE TABLE devices (
    id BIGSERIAL,
    name VARCHAR(255) DEFAULT NULL,
    uniqueid VARCHAR(255) DEFAULT NULL,
    latestposition_id BIGINT
);

CREATE TABLE positions (
    id BIGSERIAL,
    address VARCHAR(255) DEFAULT NULL,
    altitude REAL,
    course REAL,
    latitude REAL,
    longitude REAL,
    other XML DEFAULT NULL,
    power REAL,
    speed REAL,
    time TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    device_id BIGINT,
    valid BOOLEAN DEFAULT true
);

CREATE TABLE users (
    id BIGSERIAL,
    admin BOOLEAN,
    login VARCHAR(255) DEFAULT NULL,
    password VARCHAR(255) DEFAULT NULL,
    usersettings_id BIGINT
);

CREATE TABLE users_devices (
    users_id BIGINT NOT NULL,
    devices_id BIGINT NOT NULL
);

CREATE TABLE user_settings (
    id BIGSERIAL,
    speedunit VARCHAR(255) DEFAULT NULL
);

-- -------------------------------------
-- Create keys
-- -------------------------------------

ALTER TABLE application_settings
    ADD CONSTRAINT app_set_pkey
    PRIMARY KEY (id);

ALTER TABLE devices
    ADD CONSTRAINT device_pkey
    PRIMARY KEY (id);

ALTER TABLE positions
    ADD CONSTRAINT position_pkey
    PRIMARY KEY (id);

ALTER TABLE users
    ADD CONSTRAINT users_pkey
    PRIMARY KEY (id);

ALTER TABLE users_devices
    ADD CONSTRAINT no_duplicate_pk
    PRIMARY KEY(users_id, devices_id); 

ALTER TABLE users_devices
    ADD CONSTRAINT no_duplicate_unique
    UNIQUE (users_id, devices_id);

ALTER TABLE user_settings
    ADD CONSTRAINT users_setting_pkey
    PRIMARY KEY (id);


-- -------------------------------------
-- Create foreign keys
-- -------------------------------------

ALTER TABLE devices
    ADD CONSTRAINT devices_fkey
    FOREIGN KEY (latestposition_id)
    REFERENCES positions(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE positions
    ADD CONSTRAINT positions_fkey
    FOREIGN KEY (device_id)
    REFERENCES devices(id);

ALTER TABLE users
    ADD CONSTRAINT users_fkey
    FOREIGN KEY (usersettings_id)
    REFERENCES user_settings(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE users_devices
    ADD CONSTRAINT users_devices_fkey1
    FOREIGN KEY (users_id)
    REFERENCES users(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

ALTER TABLE users_devices
    ADD CONSTRAINT users_devices_fkey2
    FOREIGN KEY (devices_id)
    REFERENCES devices(id)
    ON UPDATE CASCADE
    ON DELETE CASCADE;

-- -------------------------------------
-- Create User
-- -------------------------------------

CREATE ROLE traccar_user WITH LOGIN;
ALTER ROLE traccar_user WITH ENCRYPTED PASSWORD 'traccar-is-awesome';

GRANT CONNECT
    ON DATABASE traccar_db
    TO traccar_user;

-- "public" is the default SCHEMA in a DATABASE (e.g., traccar_db)
GRANT SELECT, INSERT, UPDATE 
    ON ALL TABLES IN SCHEMA public
    TO traccar_user;

GRANT SELECT, UPDATE 
    ON ALL SEQUENCES IN SCHEMA public
    TO traccar_user;

