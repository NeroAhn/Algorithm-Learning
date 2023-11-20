package com.example.algoritm.backtraking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Phone_keypad_Test {

    @Test
    void letterCombinations_1() {
        Phone_keypad service = new Phone_keypad();
        String digits = "23";
        List<String> result = service.letterCombinations(digits);
        Assertions.assertEquals(9, result.size());
    }

    @Test
    void letterCombinations_2() {
        Phone_keypad service = new Phone_keypad();
        String digits = "";
        List<String> result = service.letterCombinations(digits);
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void letterCombinations_3() {
        Phone_keypad service = new Phone_keypad();
        String digits = "2";
        List<String> result = service.letterCombinations(digits);
    }
}