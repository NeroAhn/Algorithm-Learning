package com.example.codingtest.tm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test3_Test {

    @Test
    void solution() {
        Test3 t = new Test3();
        int[] a = {2, 4, 1, 3, 4, 6, 2, 4, 1, 6};
        int result = t.solution(a);
        Assertions.assertEquals(3, result);
    }

    @Test
    void solution2() {
        Test3 t = new Test3();
        int[] a = {5, 1, 2, 6, 6, 1, 3, 1, 4, 3, 4, 3, 4, 6, 1, 2, 4, 1, 6, 2};
        int result = t.solution(a);
        Assertions.assertEquals(7, result);
    }
}