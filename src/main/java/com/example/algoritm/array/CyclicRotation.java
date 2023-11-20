package com.example.algoritm.array;

public class CyclicRotation {
    /*
        https://app.codility.com/c/run/trainingUZ9KQH-PNA/
        배열을 한칸씩 이동 시키는 방법
        맨 마지막 원소는 제일 처음으로 와야 한다.

        1. 제일 마지막 원소를 저장
        2. 한칸씩 이동
        3. 제일 마지막 원소를 첫번째 저장
     */
    public int[] solution(int[] A, int K) {
        int N = A.length;
        if (N == 0) return A;

        int[] rotatedArray = new int[N];
        for (int i = 0; i < N; i++) {
            rotatedArray[(i + K) % N] = A[i];
        }

        return rotatedArray;
    }
}
