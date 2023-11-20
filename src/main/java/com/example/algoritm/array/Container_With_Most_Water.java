package com.example.algoritm.array;

public class Container_With_Most_Water {
    /*
        https://leetcode.com/problems/container-with-most-water/
     */
    public int maxArea(int[] height) {
        /*
            왼쪽, 오른쪽을 한칸씩 좁혀가며 물의 양 계산 > max 값 찾는다
            좁히는 기준은 왼쪽, 오른쪽 중 낮은걸 이동시킨다.
            계산식 : 둘중 낮은 높이 * (오른쪽 - 왼쪽)

            1  8  6  2  5  4  8  3  7
            l                       r      > water : 높이(1) * 길이(8 - 0 = 8) = 8,  max : 8
               l                    r      > water : 높이(7) * 길이(8 - 1 = 7) = 49, max : 49
               l                 r         > water : 높이(3) * 길이(7 - 1 = 6) = 18, max : 49
               l              r            > water : 높이(8) * 길이(6 - 1 = 5) = 40, max : 49
                  l           r            > water : 높이(6) * 길이(6 - 2 = 4) = 24, max : 49
                     l        r            > water : 높이(2) * 길이(6 - 3 = 3) = 6, max : 49
                        l     r            > water : 높이(5) * 길이(6 - 4 = 2) = 10, max : 49
                           l  r            > water : 높이(4) * 길이(6 - 5 = 1) = 4, max : 49
         */

        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            max = Math.max(max, h * (right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
