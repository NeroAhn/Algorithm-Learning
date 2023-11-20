package com.example.algoritm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Valid_Palindrome_Test {

    @Test
    void isPalindrome() {
        Valid_Palindrome service = new Valid_Palindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = service.isPalindrome(s);
        Assertions.assertTrue(palindrome);
    }

    @Test
    void isPalindrome2() {
        Valid_Palindrome service = new Valid_Palindrome();
        String s = "race a car";
        boolean palindrome = service.isPalindrome(s);
        Assertions.assertFalse(palindrome);
    }

    @Test
    void isPalindrome3() {
        Valid_Palindrome service = new Valid_Palindrome();
        String s = " ";
        boolean palindrome = service.isPalindrome(s);
        Assertions.assertTrue(palindrome);
    }
}