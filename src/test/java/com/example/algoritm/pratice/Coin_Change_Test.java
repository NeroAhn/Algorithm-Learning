package com.example.algoritm.pratice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Coin_Change_Test {

    @Test
    void coinChange_bfs() {
        Coin_Change service = new Coin_Change();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = service.coinChange_bfs(coins, amount);
        Assertions.assertEquals(3, result);
    }

    @Test
    void coinChange_bfs_2() {
        Coin_Change service = new Coin_Change();
        int[] coins = {2};
        int amount = 3;
        int result = service.coinChange_bfs(coins, amount);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void coinChange_bfs_3() {
        Coin_Change service = new Coin_Change();
        int[] coins = {1};
        int amount = 0;
        int result = service.coinChange_bfs(coins, amount);
        Assertions.assertEquals(0, result);
    }
}