package com.example.algoritm.pratice;

public class House_Robber_II {

    /*
        nums = [1,2,3,1]
        배열을 두개로 나눈다
        [1,2,3]
        [2,3,1]

        각각 dp 테이블에 최대값을 넣고
        두 dp 테이블 중 최대값을 리턴한다.
        점화식 dp[i] = max(dp[i-1], nums[i] + dp[i-2])
     */
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];

        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);
        dp2[1] = nums[1];
        dp2[2] = Math.max(nums[1], nums[2]);
        int max = Math.max(dp1[0], Math.max(dp1[1], Math.max(dp2[1], dp2[2])));

        // 1, 2, 3 탐색
        for (int i = 2; i < nums.length - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], nums[i] + dp1[i - 2]);
            max = Math.max(max, dp1[i]);
        }

        // 2, 3, 1 탐색
        for (int i = 3; i < nums.length; i++) {
            dp2[i] = Math.max(dp2[i - 1], nums[i] + dp2[i - 2]);
            max = Math.max(max, dp2[i]);
        }

        return max;
    }
}
