package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Jump_Game_Test {

    @Test
    void canJump_1() {
        Jump_Game service = new Jump_Game();
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = service.canJump(nums);
        Assertions.assertEquals(true, result);
    }

    @Test
    void canJump_2() {
        Jump_Game service = new Jump_Game();
        int[] nums = {3,2,1,0,4};
        boolean result = service.canJump(nums);
        Assertions.assertEquals(false, result);
    }
}