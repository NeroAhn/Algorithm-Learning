package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 삼진법_뒤집기_Test {

    @Test
    void solution_1() {
        삼진법_뒤집기 service = new 삼진법_뒤집기();
        int n = 45;
        int result = service.solution(n);
        Assertions.assertEquals(7, result);
    }

    @Test
    void solution_2() {
        삼진법_뒤집기 service = new 삼진법_뒤집기();
        int n = 125;
        int result = service.solution(n);
        Assertions.assertEquals(229, result);
    }
}