package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 단어_변환_Test {

    @Test
    void solution_1() {
        단어_변환 service = new 단어_변환();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int expected = 4;
        int result = service.solution(begin, target, words);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solution_2() {
        단어_변환 service = new 단어_변환();
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log"};
        int expected = 0;
        int result = service.solution(begin, target, words);
        Assertions.assertEquals(expected, result);
    }
}