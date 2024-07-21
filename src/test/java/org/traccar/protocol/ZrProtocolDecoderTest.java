package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;


public class ZrProtocolDecoderTest extends ProtocolTest {
    @Test
    public void testDecode() throws Exception {
        var decoder = inject(new ZrProtocolDecoder(null));

        verifyPosition(decoder, binary("DDDD008C10400000000863998041174278010211D8F278230F000104231000080000000000008000240000045443303123A3000464FA94082A500004000035B72047000800000000000000F7204F0006000035E805032350000103209500160060000000E30000004C06CA3C5B01587C6A64FA93032130000E01CC0000286600000EEF64FA9408240C000400000000D2FFFF"));

        verifyPosition(decoder, binary("DDDD008C10400000000863998041174278010211D8F478230F000104231000080000000000008000240000045443303123A3000464FA94162A500004000035C8204700080000000E00000005204F0006000035E805032350000103209500160060000000E30000004C06CA3C5B01587C6A64FA93032130000E01CC0000286600000EEF64FA9416240C00040000000057FFFF"),
                position("2023-09-08 03:20:35.000", true, 22.576234, 113.917019));

    }
}
