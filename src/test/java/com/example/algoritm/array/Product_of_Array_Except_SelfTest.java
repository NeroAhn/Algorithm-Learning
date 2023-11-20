package com.example.algoritm.array;

import org.junit.jupiter.api.Test;

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