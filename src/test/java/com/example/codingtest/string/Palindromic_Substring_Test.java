package com.example.codingtest.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Palindromic_Substring_Test {

    @Test
    void countSubstrings() {
        Palindromic_Substring service = new Palindromic_Substring();
        String s= "abc";
        int result = service.countSubstrings(s);
        Assertions.assertEquals(3, result);
    }

    @Test
    void countSubstrings2() {
        Palindromic_Substring service = new Palindromic_Substring();
        String s= "aaa";
        int result = service.countSubstrings(s);
        Assertions.assertEquals(6, result);
    }
}