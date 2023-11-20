package com.example.codingtest.backtraking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/
 */
public class Combination_Sum {

    /*
        Input: candidates = [2,3,5], target = 8
        Output: [[2,2,2,2],[2,3,3],[3,5]]

                    2                    3                       5
              2     3     5         2    3      5         2      3      5
            2 3 5 2 3 5 2 3 5   2 3 5  2 3 5  2 3 5     2 3 5  2 3 5  2 3 5

           각 숫자별로 재귀 호출 > 합이 8이 되는 경우 리턴
           재귀를 호출하는 조건은 합이 8보다 넘어가면 계산할 필요가 없다

     */

    List<List<Integer>> results;
    int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.results = new ArrayList<>();
        this.candidates = candidates;
        Arrays.sort(this.candidates);

        backtracking(target, 0, new ArrayList<>());

        return results;
    }

    private void backtracking(int remain, int startIndex, List<Integer> combinations) {
        // base case
        // target 에서 각 숫자를 빼는 방식으로 진행
        if (remain == 0) {
            results.add(new ArrayList<>(combinations));
            return;
        }

        // target 이 0보다 작다는 의미는 더이상 재귀호출을 하지 않아도 된다는 의미
        if (remain < 0) {
            return;
        }

        // startIndex 부터 탐색하는 이유
        // ex) candidates = [2,3,6,7], target = 7 이라면
        // 2, 2, 3 의 합이 7이고
        // 2, 3, 2 혹은 3, 2, 2 의 합도 7 이다
        // 조합은 순서에 상관없이 원소가 동일한 경우이기 때문에 2, 2, 3 외 다른 경우의 수는 포함시키지 말아야 한다.
        // 따라서 candidates 를 정렬시킨 후 start index 를 하나씩 옮겨가며 탐색을 하면
        // 3 다음에 2를 탐색하는 케이스를 막을 수 있다.
        for (int i = startIndex; i < candidates.length; i++) {
            int candidate = candidates[i];
            combinations.add(candidate);
            // 아래 index 를 넘길 때 같은 수를 사용할 수 있도록 i + 1 을 넘기지 않고 i 그대로 넘긴다.
            backtracking(remain - candidate, i, combinations);
            combinations.remove(combinations.size() - 1);
        }
    }

}
