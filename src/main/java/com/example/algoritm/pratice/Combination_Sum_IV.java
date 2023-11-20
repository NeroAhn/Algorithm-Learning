package com.example.algoritm.pratice;

public class Combination_Sum_IV {

    /*
        nums = [1,2,3], target = 4
        0 부터 target 값인 4까지 만들 수 있는 경우의 수를 DP 테이블에 저장 한다.

        최초
        i   0  1  2  3  4
        db [1][0][0][0][0]

        i = 1 > 1을 만들 수 있는 경우의 수 = 1 한가지 케이스
        i   0  1  2  3  4
        db [1][1][0][0][0]

        i = 2 > 2를 만들 수 있는 경우의 수 = 1,1 과 2 두가지 케이스
        i   0  1  2  3  4
        db [1][1][2][0][0]

        i = 3 > 3을 만들 수 있는 경우의 수 = 1,1,1 / 1,2 / 2,1 / 3  네가지 케이스
        i   0  1  2  3  4
        db [1][1][2][4][0]

        i = 4 > 4을 만들 수 있는 경우의 수 = 1,1,1,1 / 1,1,2 / 1,2,1 / 2,1,1 / 2,2 / 1,3 / 3,1  일곱가지 케이스
        i   0  1  2  3  4
        db [1][1][2][4][7]

        즉 점화식은
        nums 를 순환하면서 dp[i] += dp[i - nums[j]];

     */

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }

        return dp[target];
    }
}
