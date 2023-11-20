package com.example.codingtest.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_Test {

    @Test
    void maxVowels_1() {
        Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length service = new Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();
        String s = "abciiidef";
        int k = 3;
        int result = service.maxVowels(s, k);
        Assertions.assertEquals(3, result);
    }

    @Test
    void maxVowels_2() {
        Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length service = new Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();
        String s = "aeiou";
        int k = 2;
        int result = service.maxVowels(s, k);
        Assertions.assertEquals(2, result);
    }

    @Test
    void maxVowels_3() {
        Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length service = new Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();
        String s = "leetcode";
        int k = 3;
        int result = service.maxVowels(s, k);
        Assertions.assertEquals(2, result);
    }
}