package com.example.algoritm.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Number_of_Provinces_Test {

    @Test
    void findCircleNum_1() {
        Number_of_Provinces service = new Number_of_Provinces();
        int[][] isConnected = {{1,1,0}, {1,1,0}, {0,0,1}};
        int result = service.findCircleNum(isConnected);
        Assertions.assertEquals(2, result);
    }

    @Test
    void findCircleNum_2() {
        Number_of_Provinces service = new Number_of_Provinces();
        int[][] isConnected = {{1,0,0}, {0,1,0}, {0,0,1}};
        int result = service.findCircleNum(isConnected);
        Assertions.assertEquals(3, result);
    }
}