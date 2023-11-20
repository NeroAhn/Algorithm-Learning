package com.example.codingtest.backtraking;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 */
public class Subsets {

    /*
        중복되지 않은 조합 가능한 서브셋을 만들어야 한다.
        Input: nums = [1,2,3]
        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

        1,2,3 이 각각 있을때와 없을때의 경우의 수가 존재
        1   2   3
        T   T   T
        F   F   F

        1 이 선택 안된 케이스 | 1이 선택된 케이스
        위 두가지 케이스를 모두 고려해야 한다.

                        X | 1

            X | 2                   X | 2

        X | 3       X | 3       X | 3   X | 3


     */

    List<List<Integer>> results;

    public List<List<Integer>> subsets(int[] nums) {
        results = new ArrayList<>();

        backtraking(nums, 0, new ArrayList<>());

        return results;
    }

    public void backtraking(int[] nums, int index, List<Integer> combinations) {
        // base case
        // 현재 index 가 nums 의 마지막 원소라면
        // 현재까지 조합된 케이스를 저장한다.
        if (index == nums.length) {
            results.add(new ArrayList<>(combinations));
            return;
        }

        int num = nums[index];
        combinations.add(num);
        // 해당 원소가 포함되는 케이스
        backtraking(nums, index + 1, combinations);

        // 백트래킹을 위한 이전 삽입 원소 제거
        combinations.remove(combinations.size() - 1);
        // 해당 원소가 포함되지 않는 케이스
        backtraking(nums, index + 1, combinations);
    }
}
