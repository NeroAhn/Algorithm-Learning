package com.example.codingtest.pratice;

import java.util.List;

public class Word_Break {

    /*
        주어진 문자열이 배열의 단어로 이루어졌는지 확인
        leetcode
        dp[t][f][f][f][f][f][f][f][f]




     */
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        // 문자열 기준 순회
        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                int lastWordIndex = i - word.length();
                if (lastWordIndex >= 0 && dp[lastWordIndex] == true && word.equals(s.substring(lastWordIndex, i))) {
                    dp[i] = true;
                }
            }
        }


        return dp[s.length()];
    }
}
