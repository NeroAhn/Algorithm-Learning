package com.example.algoritm.time_complexity;

public class PermMissingElem {

    /*

     */
    public int solution(int[] A) {
        // 1 부터 N + 1 까지의 합
        int N = A.length + 1;
        long totalSum = N * (N + 1) / 2;
        long sum = 0;
        for (int a : A) {
            sum += a;
        }

        return (int) (totalSum - sum);
    }
}
