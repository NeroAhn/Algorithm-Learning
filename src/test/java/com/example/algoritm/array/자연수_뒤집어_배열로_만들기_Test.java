package com.example.algoritm.array;

import com.example.algoritm.string.자연수_뒤집어_배열로_만들기;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class 자연수_뒤집어_배열로_만들기_Test {

    @Test
    void solution() {
        자연수_뒤집어_배열로_만들기 service = new 자연수_뒤집어_배열로_만들기();
        long n = 12345;
        int[] result = service.solution(n);
        int[] expected = {5, 4, 3, 2, 1};
        int compare = Arrays.compare(expected, result);
        Assertions.assertEquals(0, compare);
    }
}