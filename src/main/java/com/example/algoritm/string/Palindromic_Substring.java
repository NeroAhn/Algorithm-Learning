package com.example.algoritm.string;

public class Palindromic_Substring {

    public int countSubstrings(String s) {
        if (s == null || s.length() < 1) return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int count1 = expandAroundCenter(s, i, i); // 홀수 길이 팰린드롬
            int count2 = expandAroundCenter(s, i, i + 1); // 짝수 길이 팰린드롬
            count += count1 + count2;
        }
        return count;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
