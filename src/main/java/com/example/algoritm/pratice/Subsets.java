package com.example.algoritm.pratice;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    /*
             1|X
        2|X      2|X
     3|X  3|X  3|X  3|X


     */

    List<List<Integer>> result;

    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();

        combination(nums, 0, new ArrayList<>());

        return result;
    }

    private void combination(int[] nums, int index, List<Integer> subsets) {
        if (nums.length == index) {
            result.add(new ArrayList<>(subsets));
            return;
        }

        int num = nums[index];

        // 숫자가 포함되지 않는 경우
        combination(nums, index + 1, subsets);

        // 숫자가 포함되는 경우
        subsets.add(num);
        combination(nums, index + 1, subsets);
    }
}
