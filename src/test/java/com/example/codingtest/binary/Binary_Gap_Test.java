package com.example.codingtest.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Binary_Gap_Test {

    @Test
    void solution() {
        Binary_Gap t = new Binary_Gap();
        int N = 9;
        int result = t.solution(N);
        Assertions.assertEquals(2, result);
    }

    @Test
    void solution2() {
        Binary_Gap t = new Binary_Gap();
        int N = 32;
        int result = t.solution(N);
        Assertions.assertEquals(0, result);
    }
}