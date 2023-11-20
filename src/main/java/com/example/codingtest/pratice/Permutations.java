package com.example.codingtest.pratice;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    /*
        1       2       3
      2   3    1  3    1  2
     3     2  3    1  2     1
     */

    List<List<Integer>> result;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();

        bactracking(nums, 0, new ArrayList<>());

        return result;
    }

    private void bactracking(int[] nums, int index, List<Integer> permutations) {
        if (index == nums.length) {
            result.add(new ArrayList<>(permutations));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int candidate = nums[i];
            if (!permutations.contains(candidate)) {
                permutations.add(candidate);
                bactracking(nums, index + 1, permutations);
                permutations.remove(permutations.size() - 1);
            }
        }
    }
    /*
        result = [[1, 2, 3]];
        visited [T,F,T]

        index = 0
        per [1]
            index = 1
            per [1, 2]
                index = 2
                per [1, 2, 3]
             per [1, 2]




     */
}
