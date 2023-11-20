package com.example.algoritm.dp;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-increasing-subsequence/
 */
public class Longest_Increasing_Subsequence {
    /*
        최장 증가 부분 수열 (LIS)
        DP 테이블을 이용하여 각 위치별 LIS 를 계산한다.
        nums : 0   1   0   3   2   3
        dp   : 1   2   1   3   3   4
        점화식 : dp[i] = Math.max(dp[i], dp[0] ~ dp[i-1] + 1)
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        // 1로 초기화
        Arrays.fill(dp, 1);
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public int lengthOfLIS2(int[] nums) {
        int[] lis_dp = new int[nums.length];
        Arrays.fill(lis_dp, 1);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lis_dp[i] = Math.max(lis_dp[i], lis_dp[j] + 1);
                }
            }
            max = Math.max(max, lis_dp[i]);
        }

        return max;
    }
}
