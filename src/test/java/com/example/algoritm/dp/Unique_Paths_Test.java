package com.example.algoritm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Unique_Paths_Test {

    @Test
    void uniquePaths_1() {
        Unique_Paths service = new Unique_Paths();
        int m = 3, n = 7;
        int result = service.uniquePaths(m, n);
        Assertions.assertEquals(28, result);
    }

    @Test
    void uniquePaths_2() {
        Unique_Paths service = new Unique_Paths();
        int m = 3, n = 2;
        int result = service.uniquePaths(m, n);
        Assertions.assertEquals(3, result);
    }

    @Test
    void uniquePaths_3() {
        Unique_Paths service = new Unique_Paths();
        int m = 3, n = 7;
        int result = service.uniquePaths2(m, n);
        Assertions.assertEquals(28, result);
    }

    @Test
    void uniquePaths_4() {
        Unique_Paths service = new Unique_Paths();
        int m = 3, n = 2;
        int result = service.uniquePaths2(m, n);
        Assertions.assertEquals(3, result);
    }
}