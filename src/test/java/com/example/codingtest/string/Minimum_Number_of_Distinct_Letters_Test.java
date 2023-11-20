package com.example.codingtest.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Minimum_Number_of_Distinct_Letters_Test {

    @Test
    void test() {
        Minimum_Number_of_Distinct_Letters service = new Minimum_Number_of_Distinct_Letters();
        String a = "amz";
        String b = "amz";
        int result = service.solution(a, b);
    }
}