package com.example.algoritm.string;

public class 이진변환_반복하기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/70129
     */

    public int[] solution(String s) {
        int cycle = 0;
        int remove_zero = 0;
        while (!s.equals("1")) {
            int before_length = s.length();
            s = s.replaceAll("0", "");
            remove_zero += before_length - s.length();
            s = Integer.toString(s.length(), 2);
            cycle++;
        }
        int[] result = {cycle, remove_zero};
        return result;
    }
}
