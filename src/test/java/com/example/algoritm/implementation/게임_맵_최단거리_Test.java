package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 게임_맵_최단거리_Test {

    @Test
    void solution_1() {
        게임_맵_최단거리 service = new 게임_맵_최단거리();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int expected = 11;
        int result = service.solution(maps);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void solution_2() {
        게임_맵_최단거리 service = new 게임_맵_최단거리();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
        int expected = -1;
        int result = service.solution(maps);
        Assertions.assertEquals(expected, result);
    }
}