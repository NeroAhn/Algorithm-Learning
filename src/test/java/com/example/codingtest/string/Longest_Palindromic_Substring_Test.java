package com.example.codingtest.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Longest_Palindromic_Substring_Test {

    @Test
    void longestPalindrome() {
        Longest_Palindromic_Substring service = new Longest_Palindromic_Substring();
        String s = "babad";
        String result = service.longestPalindrome(s);
        Assertions.assertEquals("bab", result);
    }
}