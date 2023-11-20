package com.example.algoritm.pratice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Combination_Sum_IV_Test {

    @Test
    void combinationSum4() {
        Combination_Sum_IV service = new Combination_Sum_IV();
        int[] nums = {1, 2, 3};
        int target = 4;
        int result = service.combinationSum4(nums, target);
        Assertions.assertEquals(7, result);
    }
}