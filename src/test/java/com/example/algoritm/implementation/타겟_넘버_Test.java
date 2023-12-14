package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 타겟_넘버_Test {

    @Test
    void solution() {
        타겟_넘버 service = new 타겟_넘버();
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int expected = 5;
        int result = service.solution(numbers, target);
        Assertions.assertEquals(expected, result);
    }
}