package com.example.codingtest.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Valid_Parentheses_Test {

    @Test
    void isValid() {
        Valid_Parentheses service = new Valid_Parentheses();
        service.isValid("([]{}");
    }
}