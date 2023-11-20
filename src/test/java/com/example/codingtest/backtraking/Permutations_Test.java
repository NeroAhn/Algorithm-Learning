package com.example.codingtest.backtraking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Permutations_Test {

    @Test
    void permute_1() {
        Permutations service = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = service.permute(nums);
        Assertions.assertEquals(6, result.size());
    }
}