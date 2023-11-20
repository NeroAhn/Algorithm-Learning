package com.example.codingtest.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search_in_Rotated_Sorted_Array_Test {

    @Test
    void search() {
        Search_in_Rotated_Sorted_Array service = new Search_in_Rotated_Sorted_Array();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 5;
        int result = service.search(nums, target);
        Assertions.assertEquals(1, result);
    }

    @Test
    void search2() {
        Search_in_Rotated_Sorted_Array service = new Search_in_Rotated_Sorted_Array();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int result = service.search(nums, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void search3() {
        Search_in_Rotated_Sorted_Array service = new Search_in_Rotated_Sorted_Array();
        int[] nums = {1};
        int target = 0;
        int result = service.search(nums, target);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void search4() {
        Search_in_Rotated_Sorted_Array service = new Search_in_Rotated_Sorted_Array();
        int[] nums = {5,1,2,3,4};
        int target = 1;
        int result = service.search(nums, target);
        Assertions.assertEquals(1, result);
    }
}