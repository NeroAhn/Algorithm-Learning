package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class House_Robber_Test {

    @Test
    void rob_1() {
        House_Robber service = new House_Robber();
        int[] nums = {1, 2, 3, 1};
        int result = service.rob(nums);
        Assertions.assertEquals(4, result);
    }

    @Test
    void rob_2() {
        House_Robber service = new House_Robber();
        int[] nums = {2,7,9,3,1};
        int result = service.rob(nums);
        Assertions.assertEquals(12, result);
    }

    @Test
    void rob_3() {
        House_Robber service = new House_Robber();
        int[] nums = {2,1,1,2};
        int result = service.rob(nums);
        Assertions.assertEquals(4, result);
    }
}