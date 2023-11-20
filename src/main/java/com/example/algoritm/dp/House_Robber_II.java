package com.example.algoritm.dp;

/**
 *  https://leetcode.com/problems/house-robber-ii/
 */
public class House_Robber_II {
    /*
        nums = [1, 2, 3, 1]
        첫번째를 방문하면 마지막은 방문 못함
        반대로 마지막을 방문하면 첫번째를 방문 못함
        즉 [1, 2, 3] 과 [2, 3, 1] 로 나누고 각 케이스별 큰값
       [1, 2, 3]
       0번째 > nums[0] = 1
       1번째 > max(nums[0], nums[1]) = 2
       2번째 > max(nums[2] + dp[0], dp[1]) = 4

       [2, 3, 1]
       0번째 > nums[0] = 2
       1번째 > max(nums[0], nums[1]) = 3
       2번째 > max(nums[2] + dp[0], dp[1]) = 3


     */
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        int max = 0;
        dp2[0] = 0;
        dp1[0] = nums[0];
        dp2[1] = nums[1];
        dp1[1] = Math.max(nums[0], nums[1]);
        dp2[2] = Math.max(nums[1], nums[2]);
        max = Math.max(dp1[0], Math.max(dp1[1], Math.max(dp2[1], dp2[2])));

        // 첫번째 loop : 2 ~ length - 1
        for (int i = 2; i < nums.length - 1; i++) {
            dp1[i] = Math.max(nums[i] + dp1[i - 2], dp1[i - 1]);
            max = Math.max(max, dp1[i]);
        }

        // 두번째 loop : 3 ~ length
        for (int i = 3; i < nums.length; i++) {
            dp2[i] = Math.max(nums[i] + dp2[i - 2], dp2[i - 1]);
            max = Math.max(max, dp2[i]);
        }

        return max;
    }
}
