package com.example.algoritm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OddOccurrencesInArray_Test {

    @Test
    void solution() {
        OddOccurrencesInArray t = new OddOccurrencesInArray();
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = t.solution(A);
        Assertions.assertEquals(7, result);
    }
}