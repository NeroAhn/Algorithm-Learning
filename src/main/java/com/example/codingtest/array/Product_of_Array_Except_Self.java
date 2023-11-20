package com.example.codingtest.array;

public class Product_of_Array_Except_Self {
    /*
        https://leetcode.com/problems/product-of-array-except-self/
        1, 2, 3, 4 > 24, 12, 8, 6
        O(N) 의 시간복잡도 로 구현하려면
        loop 를 두번 순회하도록 한다.
        첫번째 loop > 처음 부터 탐색 >  현재 위치 기준 왼쪽 값들의 곱 저장
            1, 1, 2, 6
        두번째 loop > 마지막 부터 탐색 > 현재 위치 기준 오른쪽 값들의 곱 저장
            제일 마지막은 오른쪽이 없으므로 1을 곱한다.
            right 값을 별도로 변수에 담아놓고 계산하는게 중요
            right = 1 > 4 > 12 > 24
            24, 12, 8 , 6
     */

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        // 왼쪽 계산
        // 왼쪽 계산 시 첫번째는 계산할 필요가 없으므로 1로 저장
        answer[0] = 1;
        // 두번째 index 부터 오른쪽으로 이동하며 현재 위치를 제외한 왼쪽 값들을 곱한 결과 저장
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // 오른쪽 계산
        // 오른쪽 계산 시 마지막 index 부터 왼쪽으로 이동하며 왼쪽 계산시 구해놓은 값과
        // 오른쪽에 곱해놓은 값을 곱한다.
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}
