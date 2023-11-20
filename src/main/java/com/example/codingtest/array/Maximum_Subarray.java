package com.example.codingtest.array;

public class Maximum_Subarray {
    /*
        https://leetcode.com/problems/maximum-subarray/
     */

    public int maxSubArray(int[] nums) {
        // Kadene 알고리즘
        // 현재합
        int currSum = 0;
        // 최대합
        int maxSum = -10000;

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

}
