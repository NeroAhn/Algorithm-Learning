package com.example.algoritm.time_complexity;

public class TapeEquilibrium {
    /*
        3 1 2 4 3
     */

    public int solution(int[] A) {
        int totalSum = 0;
        for (int a : A) {
            totalSum += a;
        }

        int leftSum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            int rightSum = totalSum - leftSum;
            min = Math.min(min, Math.abs(leftSum - rightSum));
        }

        return min;
    }
}
