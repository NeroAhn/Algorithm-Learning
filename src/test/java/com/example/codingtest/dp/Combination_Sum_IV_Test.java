package com.example.codingtest.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Combination_Sum_IV_Test {

    @Test
    void combinationSum4_1() {
        Combination_Sum_IV service = new Combination_Sum_IV();
        int[] nums = {1, 2, 3};
        int target = 4;
        Assertions.assertEquals(7, service.combinationSum4(nums, target));
    }

    @Test
    void combinationSum4_2() {
        Combination_Sum_IV service = new Combination_Sum_IV();
        int[] nums = {9};
        int target = 3;
        Assertions.assertEquals(0, service.combinationSum4(nums, target));
    }
}