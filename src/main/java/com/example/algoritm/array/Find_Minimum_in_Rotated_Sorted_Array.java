package com.example.algoritm.array;

public class Find_Minimum_in_Rotated_Sorted_Array {
    /*
        https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

        3, 4, 5, 1, 2

        1, 2, 3, 4, 5
     */

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = Math.max((left + right) / 2, 1);
            if (nums[mid] < nums[mid - 1])
                return nums[mid];

            // 중간값과 가장 오른쪽 값 비교시
            // 중간값이 더 크다면 > 변곡점이 오른쪽에 있는것 > 오른쪽 탐색
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left];
    }

    private int test(int[] nums) {
        // 3  4  5  1  2
        //          ^  ^
        // 4  5  6  7  0  1  2
        //             lr
        //  11  13  15  17
        //  l   m        r
        //  lr
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            // 오른쪽에 변곡점이 있다면
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left];
    }
}
