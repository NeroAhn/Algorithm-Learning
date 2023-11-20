package com.example.algoritm.pratice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Decode_Ways_Test {

    @Test
    void test_1() {
        Decode_Ways service = new Decode_Ways();
        int result = service.numDecodings_dfs("226");
        Assertions.assertEquals(3, result);
    }

}