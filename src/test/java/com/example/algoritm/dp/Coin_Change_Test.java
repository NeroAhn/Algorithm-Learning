package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Coin_Change_Test {

    @Test
    void coinChange1() {
        Coin_Change service = new Coin_Change();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = service.coinChange(coins, amount);
        Assertions.assertEquals(3, result);
    }

    @Test
    void coinChange2() {
        Coin_Change service = new Coin_Change();
        int[] coins = {2};
        int amount = 3;
        int result = service.coinChange(coins, amount);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void coinChange3() {
        Coin_Change service = new Coin_Change();
        int[] coins = {1};
        int amount = 0;
        int result = service.coinChange(coins, amount);
        Assertions.assertEquals(0, result);
    }

    @Test
    void coinChange4() {
        Coin_Change service = new Coin_Change();
        int[] coins = {1, 4, 6};
        int amount = 14;
        int result = service.coinChange(coins, amount);
        Assertions.assertEquals(3, result);
    }
}