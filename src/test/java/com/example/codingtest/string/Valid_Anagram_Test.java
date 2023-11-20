package com.example.codingtest.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Valid_Anagram_Test {

    @Test
    void isAnagram() {
        Valid_Anagram service = new Valid_Anagram();
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertEquals(true, service.isAnagram(s, t));
    }

    @Test
    void isAnagram_2() {
        Valid_Anagram service = new Valid_Anagram();
        String s = "rat";
        String t = "car";
        Assertions.assertEquals(false, service.isAnagram(s, t));
    }
}