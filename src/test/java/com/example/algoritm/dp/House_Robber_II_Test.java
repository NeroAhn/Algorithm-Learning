package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class House_Robber_II_Test {

    @Test
    void rob_1() {
        House_Robber_II service = new House_Robber_II();
        int[] nums = {2, 3, 2};
        int result = service.rob(nums);
        Assertions.assertEquals(3, result);
    }

    @Test
    void rob_2() {
        House_Robber_II service = new House_Robber_II();
        int[] nums = {1, 2, 3, 1};
        int result = service.rob(nums);
        Assertions.assertEquals(4, result);
    }

    @Test
    void rob_3() {
        House_Robber_II service = new House_Robber_II();
        int[] nums = {1, 2, 3};
        int result = service.rob(nums);
        Assertions.assertEquals(3, result);
    }

    @Test
    void rob_4() {
        House_Robber_II service = new House_Robber_II();
        int[] nums = {1, 7, 9, 2};
        int result = service.rob(nums);
        Assertions.assertEquals(10, result);
    }
}