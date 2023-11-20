package com.example.codingtest.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Nearest_Exit_from_Entrance_in_Maze_Test {

    @Test
    void nearestExit_1() {
        Nearest_Exit_from_Entrance_in_Maze service = new Nearest_Exit_from_Entrance_in_Maze();
        char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int[] entrance = {1, 2};
        int result = service.nearestExit(maze, entrance);
        Assertions.assertEquals(1, result);
    }

    @Test
    void nearestExit_2() {
        Nearest_Exit_from_Entrance_in_Maze service = new Nearest_Exit_from_Entrance_in_Maze();
        char[][] maze = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
        int[] entrance = {1, 0};
        int result = service.nearestExit(maze, entrance);
        Assertions.assertEquals(2, result);
    }

    @Test
    void nearestExit_3() {
        Nearest_Exit_from_Entrance_in_Maze service = new Nearest_Exit_from_Entrance_in_Maze();
        char[][] maze = {{'.','+'}};
        int[] entrance = {0, 0};
        int result = service.nearestExit(maze, entrance);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void nearestExit_4() {
        Nearest_Exit_from_Entrance_in_Maze service = new Nearest_Exit_from_Entrance_in_Maze();
        char[][] maze = {{'+','.','+'},{'.','.','.'},{'+','.','+'}};
        int[] entrance = {1, 2};
        int result = service.nearestExit(maze, entrance);
        Assertions.assertEquals(2, result);
    }

    @Test
    void nearestExit_5() {
        Nearest_Exit_from_Entrance_in_Maze service = new Nearest_Exit_from_Entrance_in_Maze();
        char[][] maze = {{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','+','.','+'},{'+','+','+','+','+','+','.'}};
        int[] entrance = {0, 1};
        int result = service.nearestExit(maze, entrance);
        Assertions.assertEquals(-1, result);
    }

    @Test
    void nearestExit_6() {
        Nearest_Exit_from_Entrance_in_Maze service = new Nearest_Exit_from_Entrance_in_Maze();
        char[][] maze = {{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','.','.','+'},{'+','+','+','+','.','+','.'}};
        int[] entrance = {0, 1};
        int result = service.nearestExit(maze, entrance);
        Assertions.assertEquals(7, result);
    }
}