package com.example.algoritm.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Evaluate_Division_Test {

    @Test
    void calcEquation_1() {
        Evaluate_Division service = new Evaluate_Division();
        List<List<String>> equations = new ArrayList<>();
        equations.add(List.of("a", "b"));
        equations.add(List.of("b", "c"));
        double[] values = new double[2];
        values[0] = 2.0;
        values[1] = 3.0;
        List<List<String>> queries = new ArrayList<>();
        queries.add(List.of("a", "c"));
        queries.add(List.of("b", "a"));
        queries.add(List.of("a", "e"));
        queries.add(List.of("a", "a"));
        queries.add(List.of("x", "x"));

        double[] results = service.calcEquation(equations, values, queries);
        String test = "";
    }
}