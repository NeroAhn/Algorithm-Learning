package com.example.codingtest.backtraking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Combination_Sum_Test {

    @Test
    void combinationSum_1() {
        Combination_Sum service = new Combination_Sum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = service.combinationSum(candidates, target);
        Assertions.assertEquals(2, result.size());
    }

    @Test
    void combinationSum_2() {
        Combination_Sum service = new Combination_Sum();
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> result = service.combinationSum(candidates, target);
        Assertions.assertEquals(3, result.size());
    }

    @Test
    void combinationSum_3() {
        Combination_Sum service = new Combination_Sum();
        int[] candidates = {2};
        int target = 8;
        List<List<Integer>> result = service.combinationSum(candidates, target);
        Assertions.assertEquals(0, result.size());
    }
}