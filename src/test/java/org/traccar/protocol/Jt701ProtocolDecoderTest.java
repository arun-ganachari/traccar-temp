package org.traccar.protocol;

import org.traccar.ProtocolTest;

import org.junit.Test;

public class Jt701ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        Jt701ProtocolDecoder decoder = new Jt701ProtocolDecoder(null);

        verifyPositions(decoder, binary(
                "2478807035371711003419081920061851380856003256223b000000000000070000000020c0ff965d54de1800000f0f0f0f0f0f0f0f0f0f02d600ea0a21"));

        verifyPositions(decoder, binary(
                "2475201509261611002313101503464722331560113555309F00000000002D0500CB206800F064109326381A03"));

        verifyPositions(decoder, binary(
                "2475810297431713003401010000030100000000000000000e000000000001000000000020e0641aba1b6f1b00000f0f0f0f0f0f0f0f0f0f000001942803"));

        verifyPositions(decoder, binary(
                "2475812067481712003406112015305705374460000003122a00000000283c00000000000120ff3e2700971500010f0f0f0f0f0f0f0f0f0f0000026c01c22475812067481712003406112015312005374460000003122a00000000283c000000000000303c3e2700971400010f0f0f0f0f0f0f0f0f0f0000026c01c32475812067481712003406112015313605374460000003122a00000000283c000000000010203c3e2700971400010f0f0f0f0f0f0f0f0f0f0000026c01c42475812067481712003406112015335705374460000003122a00000000283c000000000021203c3e2700971300010f0f0f0f0f0f0f0f0f0f0000026c01c52475812067481712003406112015365705374460000003122a00000000283c000000000021203c3e2700971300010f0f0f0f0f0f0f0f0f0f0000026c01c62475812067481712003406112015395705374460000003122a00000000283c000000000021203c3e2700971200010f0f0f0f0f0f0f0f0f0f0000026c01c72475812067481712003406112015425705374460000003122a00000000283c000000000021203c3e2700971200010f0f0f0f0f0f0f0f0f0f0000026c01c82475812067481712003406112015455705374460000003122a00000000283c000000000021203c3e2700971500010f0f0f0f0f0f0f0f0f0f0000026c01c924758120674817120034061120154857"));

        verifyPositions(decoder, binary(
                "2440811188882400A209060908045322564025113242329F0598000001003F0000002D0009060908050322564025113242329F0598000001003F0000002D0009060908051322564025113242329F0598000001003F0000002D0009060908052322564025113242329F0598000001003F0000002D0009060908053322564025113242329F0598000001003F0000002D0009060908054322564025113242329F0598000001003F0000002D001F"));

        verifyPositions(decoder, binary(
                "24408111888823019509060908045322564025113242329F0598000001003F0000002D0009060908050322564025113242329F0598000001003F0000002D0009060908051322564025113242329F0598000001003F0000002D0009060908052322564025113242329F0598000001003F0000002D0009060908053322564025113242329F0598000001003F0000002D0009060908054322564025113242329F0598000001003F0000002D0009060908055322564025113242329F0598000001003F0000002D0009060908060322564025113242329F0598000001003F0000002D0009060908061322564025113242329F0598000001003F0000002D0009060908062322564025113242329F0598000001003F0000002D0009060908063322564025113242329F0598000001003F0000002D0009060908064322564025113242329F0598000001003F0000002D0009060908065322564025113242329F0598000001003F0000002D0009060908070322564025113242329F0598000001003F0000002D0009060908071322564025113242329F0598000001003F0000002D001F"));

        verifyPositions(decoder, binary(
                "2475801263981711002713061813333723501622090221558f012f0000002a070000000020c055b88552191f000f0f0f07"));

        verifyPositions(decoder, binary(
                "24408111888821001B09060908045322564025113242329F0598000001003F0000002D00AB"));

        verifyPositions(decoder, binary(
                "2475609213701711002701010000020200000000000000000e00000000000f000000000020c164cd7b00d516000f0f0f02"));

        verifyPositions(decoder, binary(
                "24657060730131001b13111710361906538525079524797f000000000000000003f300036c"));

        verifyPositions(decoder, binary(
                "24624090196121001b19071703493631277203074235752f295800005308010000768b0822"));

        verifyPositions(decoder, binary(
                "24624090196123019519071703412131285623074214252f10560000130801000076850819071703420631282832074215165f172c0000030801000076850919071703422131282792074216635f222e0000130801000076850919071703423631282808074218261f212a0000130801000076860819071703435131283678074222928f08350000930801000076860919071703440631283003074223174f19500000930801000076870819071703445131279872074224584f07380000930801000076870819071703453631280643074227091f1b220000530801000076880919071703455131281043074228216f0a260000530801000076880819071703460631281229074228988f0c260000530801000076880819071703462131281551074229954f1f220000530801000076880919071703463631281289074230503f114e0000530801000076880819071703465131281186074230884f094f0000530801000076880819071703470631280308074231240f17500000530801000076880619071703472131280358074231636f0b1d0000530801000076890821"));

        verifyPositions(decoder, binary(
                "2475604055531611002311111600311326144436028210791d016c0000001f070000000020c03c4f6d07d80ccf"));

        verifyPositions(decoder, binary(
                "2475201509260111002313101503464722331560113555309F00000000002D0500CB206800F064109326381A03"));

        verifyPositions(decoder, binary(
                "2475605035891613002328091601152806086750106533350c00000000000a000000000000e1ff4f97007f1607"));

        verifyPosition(decoder, buffer(
                "(3301210003,U01,040812,185302,T,22.564025,N,113.242329,E,5.21,152,9,32%,00000000000011,10133,5173,22,100,1)"));

        verifyPosition(decoder, buffer(
                "(3301210003,U02,040812,185302,T,22.564025,N,113.242329,E,5,152,9,32%,00000000000011,10133,5173,22,100,1)"));

        verifyPosition(decoder, buffer(
                "(3301210003,U03,040812,185302,T,22.564025,N,113.242329,E,5,152,9,32%,00000000000011,10133,5173,22,100,1)"));

        verifyNull(decoder, buffer(
                "(3301210003,U04)"));

        verifyPosition(decoder, buffer(
                "(3301210003,U06,1,040812,185302,T,22.564025,N,113.242329,E,5,152,9,32%,0000000000011,10133,5173,22,100,1,300,100,10)"));

        verifyPosition(decoder, buffer(
                "(3460311327,U01,220916,135251,T,9.552607,N,13.658292,W,0.31,0,9,0%,00001001000000,11012,10,27,0,0,33)"));

        verifyPosition(decoder, buffer(
                "(3460311327,U01,010100,000024,F,0.000000,N,0.000000,E,0.00,0,0,100%,00000001000000,263,1,18,0,0,33)"));

        verifyNull(decoder, buffer(
                "(3460311327,@JT)"));

        verifyPosition(decoder, buffer(
                "(3460311327,U06,11,220916,135643,T,9.552553,N,13.658265,W,0.61,0,9,100%,00000001000000,11012,10,30,0,0,126,0,30)"));

        verifyPosition(decoder, buffer(
                "(3460311327,U06,10,220916,140619,T,9.552495,N,13.658227,W,0.43,0,7,0%,00101001000000,11012,10,0,0,0,126,0,30)"));

        verifyPositions(decoder, binary(
                "24311021600111001B16021105591022329862114046227B0598095080012327951435161F"),
                position("2011-02-16 05:59:10.000", true, 22.54977, -114.07705));

        verifyPositions(decoder, binary(
                "24312082002911001B171012052831243810120255336425001907190003FD2B91044D1FA0"));

        verifyPositions(decoder, binary(
                "24312082002911001B1710120533052438099702553358450004061E0003EE000000000C00"));

        verifyPositions(decoder, binary(
                "24608111888821001B09060908045322564025113242329F0598000001003F0000002D00AB"));

        verifyPosition(decoder, buffer(
                "(3110312099,W01,11404.6204,E,2232.9961,N,A,040511,063736,4,7,100,4,17,1,1,company)"),
                position("2011-05-04 06:37:36.000", true, 22.54994, 114.07701));

        verifyPosition(decoder, buffer(
                "(3120820029,W01,02553.3555,E,2438.0997,S,A,171012,053339,0,8,20,6,31,5,20,20)"));

        verifyPosition(decoder, buffer(
                "(3330104377,U01,010100,010228,F,00.000000,N,000.000000,E,0,0,0,0%,00001000000000,741,14,22,0,206)"));

        verifyNull(decoder, buffer(
                "(6221107674,2,U09,129,2,A,280513113036,E,02711.0500,S,1721.0876,A,030613171243,E,02756.7618,S,2300.0325,3491,538200,14400,1)"));

        verifyPosition(decoder, buffer(
                "(3301210003,U02,040812,185302,T,00.000000,N,000.000000,E,0,0,0,0%,00000000000011,741,51,22,0,1,05)"));

        verifyPosition(decoder, buffer(
                "(3301210003,U06,4,250916,133207,T,7.011013,N,25.060708,W,27.61,102,10,0%,00101011000000,0,1,0,448,0,126,1,30)"));

        verifyPosition(decoder, buffer(
                "(3551001012,U01,010100,000032,F,0.000000,N,0.000000,E,0.00,0,0,10%,00000000010000,15748,7923,23,0,0,3E)"));

    }

}
