package com.example.codingtest.dp;

import java.util.*;

/**
 * https://leetcode.com/problems/coin-change/
 */
public class Coin_Change {
    /*
        coins = 1  2  5
        amount = 11
        5 + 5 + 1 = 11 > 총 3개 코인

        큰수부터 나누는 방법은 엣지케이스 발생
        따라서 그리디가 아닌 모든 경우의 수를 확인 (BFS)
        동전이 1, 4, 6 이 있고 14를 만들어야 한다면
                                    1
                           /        |       \
                1,1                1,4                1,6
       1,1,1   1,1,4  1,1,6  1,4,1 1,4,4 1,4,6  1,6,1 1,6,4 1,6,6
     */
    public int coinChange(int[] coins, int amount) {
        Queue<CoinInfo> queue = new LinkedList<>();
        queue.add(new CoinInfo(0, 0));
        // 방문 기록을 위한 visit
        Set<Integer> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            CoinInfo currCoin = queue.poll();
            if (currCoin.amount == amount) {
                return currCoin.count;
            }

            for (int i = 0; i < coins.length; i++) {
                int sum = currCoin.amount + coins[i];
                if (sum <= amount) {
                    if (visited.contains(sum)) continue;
                    visited.add(sum);
                    queue.add(new CoinInfo(currCoin.count + 1, sum));
                }
            }
        }

        return -1;
    }

    public class CoinInfo {
        public int count;
        public int amount;

        public CoinInfo(int count, int amount) {
            this.count = count;
            this.amount = amount;
        }
    }

}
