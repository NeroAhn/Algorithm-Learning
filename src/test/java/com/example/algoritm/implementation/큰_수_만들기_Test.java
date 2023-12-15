package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 큰_수_만들기_Test {

    @Test
    void solution_1() {
        큰_수_만들기 service = new 큰_수_만들기();
        String number = "1924";
        int k = 2;
        String expected = "94";
        String result = service.solution(number, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solution_2() {
        큰_수_만들기 service = new 큰_수_만들기();
        String number = "1231234";
        int k = 3;
        String expected = "3234";
        String result = service.solution(number, k);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solution_3() {
        큰_수_만들기 service = new 큰_수_만들기();
        String number = "4177252841";
        int k = 4;
        String expected = "775841";
        String result = service.solution(number, k);
        Assertions.assertEquals(expected, result);
    }
}