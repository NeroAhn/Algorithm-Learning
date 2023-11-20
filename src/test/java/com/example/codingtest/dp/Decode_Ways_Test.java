package com.example.codingtest.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Decode_Ways_Test {

    @Test
    void numDecodings() {
        Decode_Ways service = new Decode_Ways();
        String s = "226";
        int result = service.numDecodings(s);
        Assertions.assertEquals(3, result);
    }
}