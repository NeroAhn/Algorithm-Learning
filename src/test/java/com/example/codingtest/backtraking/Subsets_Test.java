package com.example.codingtest.backtraking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Subsets_Test {

    @Test
    void subsets() {
        Subsets service = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> results = service.subsets(nums);
        Assertions.assertEquals(8, results.size());
    }

    @Test
    void subsets_2() {
        Subsets service = new Subsets();
        int[] nums = {-1, 1, 2};
        List<List<Integer>> results = service.subsets(nums);
        Assertions.assertEquals(8, results.size());
    }
}