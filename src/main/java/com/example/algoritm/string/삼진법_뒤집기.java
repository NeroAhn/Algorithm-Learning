package com.example.algoritm.string;

public class 삼진법_뒤집기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/68935
     */

    public int solution(int n) {
        // 주어진 숫자를 10진수 > 3진수로 변환
        String n_3 = Integer.toString(n, 3);
        // StringBuilder 를 이용하여 reverse
        String reverse_n_3 = new StringBuilder(n_3).reverse().toString();
        // 다시 3진수 > 10진수로 변환
        return Integer.parseInt(reverse_n_3, 3);
    }
}
