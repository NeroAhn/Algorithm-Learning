package com.example.codingtest.tm;

import org.junit.jupiter.api.Test;

class Test2_Test {

    @Test
    void solution() {
        Test2 t = new Test2();
        String s = "1A 2F 1C";
        int result = t.solution(2, s);
    }

    @Test
    void solution2() {
        Test2 t = new Test2();
        String s = "1A 3C 2B 20G 5A";
        int result = t.solution(22, s);
    }
}