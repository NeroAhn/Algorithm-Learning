package com.example.algoritm.dp;

/**
 *  https://leetcode.com/problems/unique-paths/
 */
public class Unique_Paths {

    /*
        (0,0) 에서 (m-1, n-1) 까지 갈 수 있는 경우의 수
        이동은 오른쪽 또는 아래로만 가능
        (m-1, n-1) 위치에서 생각해보면 여기까지 올 수 있는 경우의 수는
        자신의 왼쪽 (오른쪽으로 이동 기능하기 때문에) > (m-1, n-1-1)
        자신의 위쪽 (아래로 이동 가능하기 때문에)    > (m-1-1, n-1)
        저 두 위치에서의 이동 가능한 케이스를 합친것과 같을 것...
        즉 점화식은 f(row, col) = f(row, col-1) + f(row-1, col)
        base case 는 f(0,0) = 2

     */
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int result = recur(m - 1, n - 1, dp);
        return result;
    }

    private int recur(int currM, int currN, int[][] dp) {
        if (currM == 0 || currN == 0) return 1;
        if (dp[currM][currN] > 0) return dp[currM][currN];

        return dp[currM][currN] = recur(currM, currN - 1, dp) + recur(currM - 1, currN, dp);
    }

    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) dp[i][j] += dp[i-1][j];
                if (j > 0) dp[i][j] += dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
