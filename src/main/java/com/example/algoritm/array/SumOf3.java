package com.example.algoritm.array;

import java.util.*;

public class SumOf3 {
    /*
        https://leetcode.com/problems/3sum/
     */
    public List<List<Integer>> threeSum(int[] nums) {

        /*
            -1, 0, 1, 2, -1, -4
            오름차순 정렬 후 i 를 기준으로 j, k 탐색
            i = 0
            -4  -1  -1  0  1  2
            i    j            k
            i        j        k
            i           j     k
            i              j  k

            i = 1
            -4  -1  -1  0  1  2
                 i   j        k      >> 합계 0 케이스  (-1, -1, 2)
                 i      j     k
                 i      j  k         >> 합계 0 케이스  (-1, 0, 1)

            i = 2
            -4  -1  -1  0  1  2
                     i  j     k
                     i  j  k         >> 합계 0 케이스  (-1, 0, 1)

            i = 3
            -4  -1  -1  0  1  2
                        i  j  k
         */
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i <= nums.length - 3; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return new ArrayList<>(result);
    }

}
