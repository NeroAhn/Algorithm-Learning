package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class 이진변환_반복하기_Test {

    @Test
    void solution() {
        이진변환_반복하기 service = new 이진변환_반복하기();
        String s = "110010101001";
        int[] result = service.solution(s);
        int[] expected = {3, 8};
        Assertions.assertEquals(0, Arrays.compare(expected, result));
    }
}