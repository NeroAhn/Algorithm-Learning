package com.example.algoritm.string;

public class 문자열내_p와_y의_개수 {

    boolean solution(String s) {
        s = s.toLowerCase();
        String remove_p = s.replace("p", "");
        String remove_y = s.replace("y", "");
        return s.length() - remove_p.length() == s.length() - remove_y.length();
    }
}
