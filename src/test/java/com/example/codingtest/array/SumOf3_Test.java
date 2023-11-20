package com.example.codingtest.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOf3_Test {

    @Test
    void threeSum() {
        SumOf3 service = new SumOf3();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = service.threeSum(nums);
        Assertions.assertEquals(2, results.size());
    }
}