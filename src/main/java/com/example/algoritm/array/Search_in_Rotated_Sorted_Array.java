package com.example.algoritm.array;

public class Search_in_Rotated_Sorted_Array {
    /*
        https://leetcode.com/problems/search-in-rotated-sorted-array/description/
     */
    public int search(int[] nums, int target) {
        /*
            5  1  2  3  4
            l     m     r


         */

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] == target) return left;
            if (nums[mid] == target) return mid;
            if (nums[right] == target) return  right;

            // 왼쪽 정렬
            if (nums[mid] > nums[left]) {
                // 왼쪽에 포함되는 케이스
                if (nums[left] < target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    // 오른쪽에 포함되는 케이스
                    left = mid + 1;
                }
            }
            // 오른쪽 정렬
            else {
                // 오른쪽에 포함되는 케이스
                if (nums[mid] < target && nums[right] > target) {
                    left = mid + 1;
                } else {
                    // 왼쪽에 포함되는 케이스
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
