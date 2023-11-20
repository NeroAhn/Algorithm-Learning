package com.example.codingtest.pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Coin_Change {

    // bfs 방식
    public int coinChange_bfs(int[] coins, int amount) {
        /*
            각 코인을 탐색하면서 (bfs) 합계가 amount 와 같은 경우 리턴
            최소 갯수를 알아내야 한다.

                            1            2          5
                1      2        5
              1 2 5  1 2 5    1 2 5

              같은 금액은 확인하지 않아도 되니 skip 처리

         */

        Set<Integer> visited = new HashSet<>();
        LinkedList<CoinInfo> queue = new LinkedList<>();
        queue.add(new CoinInfo(0, 0));
        visited.add(0);

        while (!queue.isEmpty()) {
            CoinInfo curr = queue.poll();

            // 현재 합계가 amount 와 같다면 리턴
            if (amount == curr.sum) {
                return curr.count;
            }

            // 가지고 있는 코인을 순환하며 탐색
            for(int i = 0; i < coins.length; i++) {
                int next_sum = curr.sum + coins[i];
                // 방문했거나 amount 보다 금액이 커지면 skip
                if (visited.contains(next_sum) || next_sum > amount) continue;

                visited.add(next_sum);
                queue.add(new CoinInfo(curr.count + 1, next_sum));
            }
        }

        return -1;
    }

    public class CoinInfo {
        int count;
        int sum;

        public CoinInfo(int count, int sum) {
            this.count = count;
            this.sum = sum;
        }
    }



    /*
        코인 1, 2, 5 가 있고 amount 가 11 인 경우
        0원 부터 11원까지 만들수 있는 최소 동전 개수를 생각해보자

        1원인 경우
        0원 > 0개
        1원 > 1원짜리 1개
        2원 > 1원짜리 2개
        3 > 1원짜리 3개 > 즉 dp[3 - 1원] + 1
        4 > dp[4 - 1원] + 1 > 4개

        2원인 경우
        0원 > 0개
        1원 > 1원짜리 1개
        2원 > 1원짜리 2개 vs dp[2 - 2원] + 1 중 작은거 > 1개 (2원짜리 1개)
        3원 > 1원짜리 3개 vs dp[3 - 2원] + 1 중 작은거 > 2개 (1원짜리 1개, 2원짜리 1개)
        4원 > 1원짜리 4개 vs dp[4 - 2원] + 1 중 작은거 > 2개 (2원짜리 2개)

        점화식
        dp[i] = Math.min(dp[i], dp[i - coin] + 1)
     */
    public int coinChange_dp(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        // 최종 금액의 자리가 amount + 1 이라면 조건에 만족하지 않았기 때문에 -1
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
