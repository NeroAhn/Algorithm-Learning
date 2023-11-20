package com.example.codingtest.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotation_Test {

    @Test
    void solution() {
        CyclicRotation t = new CyclicRotation();
        int[] A = {3, 8, 9, 7, 6};
        int[] result = t.solution(A, 3);
    }
}