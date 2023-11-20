package com.example.algoritm.dp;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class House_Robber {
    /*
        nums = [2,7,9,3,1]
        nums = [2,1,1,2]
        i 번째 도착했을 때 max 값을 구해야 한다.
        0 번째 = nums[0]
        1 번째 = max(nums[0], nums[1])
        2 번째 = max(nums[2] + nums[0], nums[1])
        점화식 : dp[i] = max(nums[i] + dp[i - 2], dp[i - 1])

     */
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
