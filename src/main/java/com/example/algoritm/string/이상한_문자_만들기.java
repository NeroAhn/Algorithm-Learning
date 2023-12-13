package com.example.algoritm.string;

public class 이상한_문자_만들기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/12930
     */
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isUpper = true;
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(isUpper ? Character.toUpperCase(c) : Character.toLowerCase(c));
                isUpper = !isUpper;
            } else {
                sb.append(c);
                isUpper = true;
            }
        }

        return sb.toString();
    }
}
