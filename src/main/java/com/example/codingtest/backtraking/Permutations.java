package com.example.codingtest.backtraking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 */
public class Permutations {
    /*
        Input: nums = [1,2,3]
        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        순열의 결과값 수는 N!

                        1               2               3
                     2     3         1     3         1     2
                   3         2     3          1    2          1

     */

    List<List<Integer>> results;
    public List<List<Integer>> permute(int[] nums) {
        results = new ArrayList<>();

        backtraking(nums, 0, new ArrayList<>());

        return results;
    }

    public void backtraking(int[] nums, int index, List<Integer> permutations) {
        // Base case
        if (index == nums.length) {
            results.add(new ArrayList<>(permutations));
            return;
        }

        // 현재 위치의 숫자를 기준으로
        for (int i = 0; i < nums.length; i++) {
            int candidate = nums[i];            // 1
            // 중복되지 않아야 하므로 현재 숫자가 permutations 에 포함되지 않을 경우에만 진행
            if (!permutations.contains(candidate)) {
                permutations.add(candidate);
                backtraking(nums, index + 1, permutations);
                // 백트래킹
                permutations.remove(permutations.size() - 1);
            }
        }
    }
}
