package com.example.codingtest.dp;

import java.util.List;

/**
 * https://leetcode.com/problems/word-break/description/
 */
public class Word_Break {
    /*
        s = "leetcode"
        wordDict = {"leet","code"}


     */

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                int lastIndex = i - word.length();
                if (lastIndex >= 0 && dp[lastIndex]) {
                    String subStr = s.substring(lastIndex, i);
                    if (word.equals(subStr)) {
                        dp[i] = true;
                    }
                }
            }
        }

        return dp[s.length()];
    }

    public boolean wordBreak2(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                int lastIndex = word.length() - i;
                if (lastIndex >= 0 && dp[lastIndex]) {
                    String subStr = s.substring(lastIndex, i);
                    if (word.equals(subStr)) {
                        dp[i] = true;
                    }
                }
            }
        }

        return dp[s.length()];
    }
}
