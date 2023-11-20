package com.example.codingtest.time_complexity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibrium_Test {

    @Test
    void solution() {
        TapeEquilibrium t = new TapeEquilibrium();
        int[] A = {3, 1, 2, 4, 3};
        int result = t.solution(A);
        Assertions.assertEquals(1, result);
    }
}