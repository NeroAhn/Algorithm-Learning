package com.example.algoritm.string;

public class 시저_암호 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/12926
     */
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c == ' ') {
                sb.append(" ");
            } else {
                int offset = Character.isUpperCase(c) ? 'A' : 'a';
                int position = c - offset;
                position = (position + n) % 26;
                sb.append((char) (offset + position));
            }
        }

        return sb.toString();
    }
}
