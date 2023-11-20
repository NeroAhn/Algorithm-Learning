package com.example.algoritm.dp;

/**
 * https://leetcode.com/problems/combination-sum-iv/
 */
public class Combination_Sum_IV {
    /*
        nums = [1, 2, 3] , target = 4
        1, 2, 3 을 조합하여 (중복가능) 더했을 경우 4가 나올수 있는 케이스
        (1, 1, 1, 1)
        (1, 1, 2)
        (1, 2, 1)
        (1, 3)
        (2, 1, 1)
        (2, 2)
        (3, 1)

        bfs 를 통하여 더해서 4가 나오는 케이스를 찾아보자
        그대신 더했을 때 4가 넘을 경우에는 skip
        >> 이럴 경우 target 이 커질수록 탐색 범위가 깊어져 타임아웃이 발생한다

        따라서 dp 테이블을 이용하여 bottom-up 방식으로 0 부터 target 까지의 수를 만들수 있는 경우의 수를 구한다
        dp          0   1   2   3   4
        경우의수    1   0   0   0   0
        점화식 dp[i] = dp[0] 부터 dp[j] 까지 순환하며 더한값


     */

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] >= 0) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }

        return dp[target];
    }


}
