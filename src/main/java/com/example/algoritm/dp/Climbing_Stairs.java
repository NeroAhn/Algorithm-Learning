package com.example.algoritm.dp;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 */
public class Climbing_Stairs {
    /*
        한번에 계단 1개 또는 2개를 올라갈 수 있다.
        n 개의 계단이 있을 경우 n 번째 계단에 올라갈 수 있는 경우의 수를 구하라.

        top-down
        점화식
        f(n) = f(n-1) + f(n-2)
        base case
        n == 1 return 1
        n == 2 return 2

     */
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        int result = recur(n, memo);
        return result;
    }

    private int recur(int n, int[] memo) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (memo[n] > 0) return  memo[n];

        return memo[n] = recur(n - 1, memo) + recur(n - 2, memo);
    }
}
