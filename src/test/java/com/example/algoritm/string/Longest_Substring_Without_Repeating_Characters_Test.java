package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Longest_Substring_Without_Repeating_Characters_Test {

    /*
        문자열 s 가 주어졌을 때
        반복되지 않는 문자로 이루어진 가장 긴 부분문자열의 길이는?
     */
    @Test
    void lengthOfLongestSubstring_1() {
        Longest_Substring_Without_Repeating_Characters service = new Longest_Substring_Without_Repeating_Characters();
        String s = "abcabcbb";
        int result = service.lengthOfLongestSubstring(s);
        Assertions.assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring_2() {
        Longest_Substring_Without_Repeating_Characters service = new Longest_Substring_Without_Repeating_Characters();
        String s = " ";
        int result = service.lengthOfLongestSubstring(s);
        Assertions.assertEquals(1, result);
    }
}