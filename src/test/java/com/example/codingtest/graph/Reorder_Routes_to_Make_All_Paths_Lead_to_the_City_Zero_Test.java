package com.example.codingtest.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero_Test {

    @Test
    void minReorder_1() {
        Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero service = new Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero();
        int n = 6;
        int[][] connections = {{0,1}, {1,3}, {2,3}, {4,0}, {4,5}};
        int result = service.minReorder(n, connections);
        Assertions.assertEquals(3, result);
    }

    @Test
    void minReorder_2() {
        Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero service = new Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero();
        int n = 5;
        int[][] connections = {{1,0}, {1,2}, {3,2}, {3,4}};
        int result = service.minReorder(n, connections);
        Assertions.assertEquals(2, result);
    }

    @Test
    void minReorder_3() {
        Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero service = new Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero();
        int n = 3;
        int[][] connections = {{1,0}, {2,0}};
        int result = service.minReorder(n, connections);
        Assertions.assertEquals(0, result);
    }
}