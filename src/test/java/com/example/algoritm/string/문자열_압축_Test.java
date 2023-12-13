package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 문자열_압축_Test {

    @Test
    void solution() {
        문자열_압축 service = new 문자열_압축();
        String s = "aabbaccc";
        int result = service.solution(s);
        Assertions.assertEquals(7, result);
    }
}