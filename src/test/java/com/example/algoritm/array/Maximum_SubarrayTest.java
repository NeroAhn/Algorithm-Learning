package com.example.algoritm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Maximum_Subarray_Test {

    @Test
    void maxSubArray() {
        Maximum_Subarray service = new Maximum_Subarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = service.maxSubArray(nums);
        Assertions.assertEquals(6, result);
    }
}