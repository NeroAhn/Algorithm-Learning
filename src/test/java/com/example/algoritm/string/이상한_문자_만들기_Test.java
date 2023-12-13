package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 이상한_문자_만들기_Test {

    @Test
    void solution() {
        이상한_문자_만들기 service = new 이상한_문자_만들기();
        String s = "try hello world";
        String expected = "TrY HeLlO WoRlD";
        String result = service.solution(s);
        Assertions.assertEquals(expected, result);
    }
}