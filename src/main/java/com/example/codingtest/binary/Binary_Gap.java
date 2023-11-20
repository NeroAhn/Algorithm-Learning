package com.example.codingtest.binary;

public class Binary_Gap {
    /*
        https://app.codility.com/c/run/training4D3YFH-WJD/

        입력받은 이진수 내 좌우가 1로 된 0의 갯수 중 가장 긴 갯수를 구하라

     */

    public int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean isStart = false;
        // Implement your solution here
        while (N > 0) {
            if ((N & 1) == 1) {
                isStart = true;
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            } else {
                if (isStart) {
                    currentGap++;
                }
            }

            N >>= 1;
        }

        return maxGap;
    }
}
