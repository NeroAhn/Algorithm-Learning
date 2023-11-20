package com.example.codingtest.array;

public class Maximum_product_subarray {
    /*
        https://leetcode.com/problems/maximum-product-subarray/description/
     */

    public int maxProduct(int[] nums) {
        int result = nums[0], min = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = min;
                min = max;
                max = temp;
            }

            min = Math.min(min * nums[i], nums[i]);
            max = Math.max(max * nums[i], nums[i]);
            result = Math.max(result, max);
        }

        return result;
    }

    private void test (int[] nums) {

        int result = nums[0], min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = min;
                min = max;
                max = temp;
            }


            min = Math.min(min * nums[i], nums[i]);
            max = Math.max(max * nums[i], nums[i]);
            result = Math.max(result, max);
        }
    }

}
