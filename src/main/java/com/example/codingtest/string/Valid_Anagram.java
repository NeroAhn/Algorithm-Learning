package com.example.codingtest.string;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    /*
        https://leetcode.com/problems/valid-anagram/
        anagram 여부 확인
        알파벳 소문자의 빈도수를 저장하기 위한 int[] 배열 선언 후
        s 는 + 1
        t 는 - 1 로 처리 후
        int[] 배열 내 0이 아닌 게 있으면 false 를 리턴
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if (count != 0) return false;
        }

        return true;
    }
}
