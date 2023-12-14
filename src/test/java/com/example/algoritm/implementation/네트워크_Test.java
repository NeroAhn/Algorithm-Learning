package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 네트워크_Test {

    @Test
    void solution_1() {
        네트워크 service = new 네트워크();
        int n = 3;
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
        int result = service.solution(n, computers);
        int expected = 2;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solution_2() {
        네트워크 service = new 네트워크();
        int n = 3;
        int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};
        int result = service.solution(n, computers);
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }
}