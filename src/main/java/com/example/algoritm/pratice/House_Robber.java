package com.example.algoritm.pratice;

public class House_Robber {

    /*
        nums = [1,2,3,1]

        dp [1][2][4][3]

        dp[i] = max(dp[i-1]. nums[i] + dp[i-1])

        dp [1][0][0][0]
        dp [1][0][0][0]

     */
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int max = dp[1];
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
