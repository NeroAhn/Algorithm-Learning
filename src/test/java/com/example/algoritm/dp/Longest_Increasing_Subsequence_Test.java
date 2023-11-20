package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Longest_Increasing_Subsequence_Test {

    @Test
    void lengthOfLIS() {
        Longest_Increasing_Subsequence service = new Longest_Increasing_Subsequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = service.lengthOfLIS(nums);
        Assertions.assertEquals(4, result);
    }
}