package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Climbing_Stairs_Test {

    @Test
    void climbStairs1() {
        Climbing_Stairs service = new Climbing_Stairs();
        Assertions.assertEquals(2, service.climbStairs(2));
    }

    @Test
    void climbStairs2() {
        Climbing_Stairs service = new Climbing_Stairs();
        Assertions.assertEquals(3, service.climbStairs(3));
    }
}