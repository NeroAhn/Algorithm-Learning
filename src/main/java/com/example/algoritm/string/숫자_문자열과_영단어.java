package com.example.algoritm.string;

public class 숫자_문자열과_영단어 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/81301
     */
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
