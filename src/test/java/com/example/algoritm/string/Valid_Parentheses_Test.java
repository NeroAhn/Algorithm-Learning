package com.example.algoritm.string;

import org.junit.jupiter.api.Test;

class Valid_Parentheses_Test {

    @Test
    void isValid() {
        Valid_Parentheses service = new Valid_Parentheses();
        service.isValid("([]{}");
    }
}