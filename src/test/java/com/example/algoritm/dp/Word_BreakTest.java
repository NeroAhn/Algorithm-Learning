package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Word_BreakTest {

    @Test
    void wordBreak1() {
        Word_Break service = new Word_Break();
        String s = "leetcode";
        List<String> wordDict = List.of("leet","code");
        boolean result = service.wordBreak(s, wordDict);
        Assertions.assertTrue(result);
    }

    @Test
    void wordBreak2() {
        Word_Break service = new Word_Break();
        String s = "applepenapple";
        List<String> wordDict = List.of("apple","pen");
        boolean result = service.wordBreak(s, wordDict);
        Assertions.assertTrue(result);
    }

    @Test
    void wordBreak3() {
        Word_Break service = new Word_Break();
        String s = "catsandog";
        List<String> wordDict = List.of("cats","dog","sand","and","cat");
        boolean result = service.wordBreak(s, wordDict);
        Assertions.assertFalse(result);
    }
}