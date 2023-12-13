package com.example.algoritm.string;

public class 문자열_다루기_기본 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/12918
     */
    public boolean solution(String s) {
        // \\d{4}|\\d{6}
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
}
