package com.example.algoritm.array;

public class 자연수_뒤집어_배열로_만들기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/12932
     */
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - 1 - i] = arr[i] - '0';
        }

        return result;
    }
}
