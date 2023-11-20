package com.example.codingtest.dp;

/**
 * https://leetcode.com/problems/jump-game/
 */
public class Jump_Game {
    /*
        nums = [2, 3, 1, 1, 4]
        dp [f, f, f, f, f]
        인 상태에서
        dp[0] > nums[0] 이 0보다 크면 true > dp [t, f, f, f, f]
        dp[1] > 이전의 nums가 현재 위치(i)에 도달할 수 있고 해당 dp 가 true 라면 true > dp [t, t, f, f, f]
        dp[2] > dp [t, t, t, f, f]
        dp[3] > dp [t, t, t, t, f]
        dp[4] > dp [t, t, t, t, t]

        nums = [3, 2, 1, 0, 4]
        dp[0] > nums[0] 이 0보다 크면 true > dp [t, f, f, f, f]
        dp[1] > 이전의 nums가 현재 위치(i)에 도달할 수 있고 해당 dp 가 true 라면 true > dp [t, t, f, f, f]
        dp[2] > dp [t, t, t, f, f]
        dp[3] > dp [t, t, t, t, f]
        dp[4] > dp [t, t, t, t, f]

        점화식 : dp[i] = 0 부터 i-1 까지의 num 값으로 i 까지 도달할 수 있고 dp 가 true

     */
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int prevNum = nums[j];
                if (i <= j + prevNum && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[nums.length - 1];
    }
}
