package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 시저_암호_Test {

    @Test
    void solution_1() {
        시저_암호 service = new 시저_암호();
        String s = "AB";
        int n = 1;
        String result = service.solution(s, n);
        Assertions.assertEquals("BC", result);
    }

    @Test
    void solution_2() {
        시저_암호 service = new 시저_암호();
        String s = "z";
        int n = 1;
        String result = service.solution(s, n);
        Assertions.assertEquals("a", result);
    }

    @Test
    void solution_3() {
        시저_암호 service = new 시저_암호();
        String s = "a B z";
        int n = 4;
        String result = service.solution(s, n);
        Assertions.assertEquals("e F d", result);
    }
}