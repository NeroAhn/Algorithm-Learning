package com.example.codingtest.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rotting_Oranges_Test {

    @Test
    void orangesRotting_1() {
        Rotting_Oranges service = new Rotting_Oranges();
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int result = service.orangesRotting(grid);
        Assertions.assertEquals(4, result);
    }

    @Test
    void orangesRotting_2() {
        Rotting_Oranges service = new Rotting_Oranges();
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        int result = service.orangesRotting(grid);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void orangesRotting_3() {
        Rotting_Oranges service = new Rotting_Oranges();
        int[][] grid = {{0,2}};
        int result = service.orangesRotting(grid);
        Assertions.assertEquals(0, result);
    }
}