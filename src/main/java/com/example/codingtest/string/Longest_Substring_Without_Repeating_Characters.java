package com.example.codingtest.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Longest_Substring_Without_Repeating_Characters {
    /*
        s = "abcabcbb"


     */
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char curr = s.charAt(end);
            // 현재 포인터 위치가 중복된 문자라면
            if (map.containsKey(curr)) {
                // 중복된 문자가 없는 위치까지 start를 이동
                start = Math.max(map.get(curr), start);
            }

            map.put(curr, end + 1);
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        return maxLength;
    }
}
