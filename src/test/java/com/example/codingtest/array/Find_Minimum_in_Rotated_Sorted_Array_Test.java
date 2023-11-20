package com.example.codingtest.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Find_Minimum_in_Rotated_Sorted_Array_Test {

    @Test
    void findMin() {
        Find_Minimum_in_Rotated_Sorted_Array service = new Find_Minimum_in_Rotated_Sorted_Array();
        int[] nums = {3, 4, 5, 1, 2};
        int result = service.findMin(nums);
        Assertions.assertEquals(1, result);
    }
}