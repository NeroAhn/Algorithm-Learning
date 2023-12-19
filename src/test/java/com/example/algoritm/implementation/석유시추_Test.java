package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 석유시추_Test {

    @Test
    void solution() {
        석유시추 service = new 석유시추();
        int[][] land = {{0, 0, 0, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 1, 1, 0}, {1, 1, 1, 0, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 1, 1}};
        int expected = 9;
        int result = service.solution(land);
        Assertions.assertEquals(expected, result);
    }
}