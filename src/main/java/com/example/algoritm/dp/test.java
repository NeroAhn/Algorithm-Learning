package com.example.algoritm.dp;

import java.util.*;

public class test {

    public int climbStairs(int n) {
        // bottom-up
        /*
        int[] dp = new int[n];
        dp[0] = 1;
        if (n > 1) {
            dp[1] = 2;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n - 1];
         */

        // top-down
        int[] dp = new int[n + 1];
        return recur(n, dp);
    }

    private int recur(int n, int[] dp) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (dp[n] > 0) return dp[n - 1];

        return dp[n] = recur(n-1, dp) + recur(n-2, dp);
    }

    public int coinChange(int[] coins, int amount) {
        // bfs 구현
        LinkedList<Coin> queue = new LinkedList<>();
        queue.add(new Coin(0, 0));

        // 메모이제이션을 위한 amount 저장용 array
        Set<Integer> memo = new HashSet<>();

        while (!queue.isEmpty()) {
            Coin coin = queue.poll();
            // 현재 가격이 같을 경우 코인 갯수 리턴
            if (coin.amount == amount) {
                return coin.count;
            }

            // 아닐 경우 각 동전별 bfs 를 위해 큐 삽입
            for (int i = 0; i < coins.length; i++) {
                int newAmount = coin.amount + coins[i];
                // 각 동전을 더했을 경우 목표 금액보다 크다면 확인할 필요 없다.
                if (newAmount > amount) continue;
                // 이미 확인한 금액이라면 skip
                if (memo.contains(newAmount)) continue;

                memo.add(newAmount);
                queue.add(new Coin(coin.count + 1, coin.amount + coins[i]));
            }
        }

        // 모두 탐색했지만 경우의 수가 없을 경우 -1 리턴
        return -1;
    }

    public class Coin {
        public int count;
        public int amount;

        public Coin(int count, int amount) {
            this.count = count;
            this.amount = amount;
        }
    }

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
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

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 0; i <= s.length(); i++) {
            for (String word : wordDict) {
                // 마지막 인덱스
                int lastIndex = i - word.length();
                if (lastIndex >= 0) {
                    if (dp[lastIndex]) {
                        String str = s.substring(lastIndex, i);
                        if (word.equals(str)) {
                            dp[i] = true;
                        }
                    }
                }
            }
        }

        return dp[s.length()];
    }
}
