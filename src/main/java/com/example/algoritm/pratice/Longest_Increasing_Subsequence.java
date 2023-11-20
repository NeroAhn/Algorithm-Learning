package com.example.algoritm.pratice;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {
    /*
        최장 증가 부분 수열
        증가 카운트 변수
        10, 9, 2, 5, 3, 7, 101, 18

        10 > [1][][][][][][][] > 10 의 LIS 는 1 (초기화) > 이전 값들이 없으므로 종료
        9  > [1][1][][][][][][] > 9 의 LIS 는 1 (초기화) > 이전 값들이 자신보다 크므로 종료
        2  > [1][1][1][][][][][] > 2 의 LIS 는 1 (초기화) > 이전 값들이 자신보다 크므로 종료
        5  > [1][1][1][2][][][][] > 5 의 LIS 는 2 > 이전 값들 중 자신보다 작은 2의 dp 가 1 이므로 + 1
        3  > [1][1][1][2][2][][][] > 3 의 LIS 는 2 > 이전 값들 중 자신보다 작은 2의 dp 가 1 이므로 + 1
        7  > [1][1][1][2][2][3][][] > 7 의 LIS 는 3 > 이전 값들 중 자신보다 작은 2, 5, 7 의 dp + 1 값 중 가장 큰 값
        101 > [1][1][1][2][2][3][4][] > 101 의 LIS 는 4 > 이전 값들 중 자신보다 작은 수들의 dp + 1 값 중 가장 큰 값
        18 > [1][1][1][2][2][3][4][4] > 18 의 LIS 는 4 > 이전 값들 중 자신보다 작은 수들의 dp + 1 값 중 가장 큰 값

        즉 점화식은
        dp[i] = max((db[0] ~ dp[i-1]) + 1);
     */

    public int lengthOfLIS(int[] nums) {
        int maxLis = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLis = Math.max(maxLis, dp[i]);
        }

        return maxLis;
    }
}
