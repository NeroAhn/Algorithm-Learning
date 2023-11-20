package com.example.codingtest.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Product_of_Array_Except_Self_Test {

    @Test
    void productExceptSelf() {
        Product_of_Array_Except_Self service = new Product_of_Array_Except_Self();
        int[] nums = {1, 2, 3, 4};
        int[] answer = service.productExceptSelf(nums);
        for (int a : answer) {
            System.out.print(a + ", ");
        }
    }
}