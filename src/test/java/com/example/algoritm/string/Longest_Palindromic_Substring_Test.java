package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Longest_Palindromic_Substring_Test {

    @Test
    void longestPalindrome() {
        Longest_Palindromic_Substring service = new Longest_Palindromic_Substring();
        String s = "babad";
        String result = service.longestPalindrome(s);
        Assertions.assertEquals("bab", result);
    }
}