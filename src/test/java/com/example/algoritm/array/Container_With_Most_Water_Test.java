package com.example.algoritm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Container_With_Most_Water_Test {

    @Test
    void maxArea1() {
        Container_With_Most_Water service = new Container_With_Most_Water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = service.maxArea(height);
        Assertions.assertEquals(49, result);
    }

    @Test
    void maxArea2() {
        Container_With_Most_Water service = new Container_With_Most_Water();
        int[] height = {1,1};
        int result = service.maxArea(height);
        Assertions.assertEquals(1, result);
    }
}