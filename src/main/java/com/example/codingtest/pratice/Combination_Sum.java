package com.example.codingtest.pratice;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    /*
            2           3           5
        2   3   5   2   3   5   2   3   5
       235 235 235 235 235 235 235 235 235
     */

    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();

        backtracking(candidates, 0, target, new ArrayList<>());

        return result;
    }

    private void backtracking(int[] candidates, int index, int target, List<Integer> combinations) {
        int sum = combinations.stream().mapToInt(Integer::intValue).sum();
        if (sum == target) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (sum + candidates[i] > target) continue;
            combinations.add(candidates[i]);
            backtracking(candidates, i, target, combinations);
            combinations.remove(combinations.size() - 1);
        }
    }
}
