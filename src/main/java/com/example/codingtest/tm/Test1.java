package com.example.codingtest.tm;

public class Test1 {


    /*
        There is an array A that consists of N integers. In one move you can select a number from A and replace it by the sum of its digits. One number can be selected multiple times. You can apply at most two moves. What is the minimum sum of the array you can achieve?

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the minimum sum of the array you can achieve after applying at most two moves.

Examples:

1. Given A = [1, 10, 12, 3], you can apply the move on the second and third elements. Then A = [1, 1, 3, 3] and the function should return 8.

2. Given A = [2, 29, 3], you can apply the move twice on the second element. Then A = [2, 2, 3] and the function should return 7.

3. Given A = [100, 101, 102, 103], you can apply the move on the first and second elements. Then A = [1, 2, 102, 103] and the function should return 208.

4. Given A = [55], you can apply the move twice on the first element. Then A = [1] and the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..50,000];
each element of array A is an integer within the range [1..10,000].

        배열 A 에서 원소 하나를 선택 각 자릿수의 합으로 대체 (최대 2번 가능)
        [1, 10, 12, 3] > [1, 1(1+0), 3(1+2), 3]
        [2, 29, 3] > [2, 11(2+9), 3] > [2, 2(1+1), 3]
        [100, 101, 102, 103] > [1(1+0+0), 2(1+0+1), 102, 103] >> 100 과 101 을 합하는 게 102, 103 보다 적기 때문에
        배열의 최소합을 구하라
    */
    public int solution(int[] A) {
        // 원래값 - 자리수 합계 의 차이가 큰 2개의 원소를 찾아야 한다.
        // 자리수 합계 저장용 배열을 만들고
        // 원본 배열과 비교하여 차이가 큰 2개에 원소에 대해 합계를 구한다
        int[] sums = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            sums[i] = digitSum(A[i]);
        }

        // 원본 배열과 차이가 큰 두개의 요소 체크
        int firstIdx = -1, secondIdx = -1;
        for(int i = 0; i < A.length; i++) {
            int currentDiff = A[i] - sums[i];
            // 현재 위치의 차이가 첫번째 idx 보다 더 크다면
            if (firstIdx == -1 || currentDiff > A[firstIdx] - sums[firstIdx]) {
                secondIdx = firstIdx;
                firstIdx = i;
            } else if (secondIdx == -1 || currentDiff > A[secondIdx] - sums[secondIdx]) {
                secondIdx = i;
            }
        }

        // 선택된 두 위치를 자리수 합계로 대체
        if (firstIdx != -1) {
            A[firstIdx] = sums[firstIdx];
        }
        if (secondIdx != -1) {
            A[secondIdx] = sums[secondIdx];
        }

        int sum = 0;
        for (int num : A) {
            sum += num;
        }

        return sum;
    }

    private int digitSum(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }

        // 합계가 10보다 클 경우 한자리수가 될때 까지 반복
        while (result >= 10) {
            int result2 = 0;
            while (result > 0) {
                result2 += result % 10;
                result /= 10;
            }
            result = result2;
        }

        return result;
    }
}
