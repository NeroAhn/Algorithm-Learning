package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 단속카메라_Test {

    @Test
    void solution_1() {
        단속카메라 service = new 단속카메라();
        int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        int expected = 2;
        int result = service.solution(routes);
        Assertions.assertEquals(expected, result);
    }
}