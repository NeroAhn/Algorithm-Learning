package com.example.algoritm.graph;

import java.util.*;

/**
 * https://leetcode.com/problems/evaluate-division
 */
public class Evaluate_Division {
    /*
        quations = [["a","b"],["b","c"]]
        values = [2.0,3.0]
        queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]

        a/b = 2.0 이라는 것은 b/a = 1/2 라는 의미이다.
        또한 b/c = 3.0 이라는 것은 반대로 c/b = 1/3 이라는 뜻.
        결국
        a -> b 로는 2의 weight 가 있고
        b -> a 로는 1/2의 weight 가 있다
        b -> c 로는 3
        c -> b 로는 1/3
        위와 같은 상태에서
        a -> c 의 의미는 a -> b -> c 이고 (a -> b) 의 weight 인 2와 (b -> c) 의 weight 인 3을 곱한 6이 된다.
        b -> a 의 경우는 위에서 구한 1/2
        a -> e 는 e 가 없기 때문에 -1
        a -> a 는 자기 자신이기 때문에 1
        x -> x 는 x 가 없기 때문에 -1

        해당 관계를 그래프화 하자면
        HashMap<String, HashMap<String, Double>> maps 의 자료구로를 선언하고
        quations 를 순환하면서 map 에 각각 집어 넣는다.
        ["a", "b"] 를 예로들면
        1. maps.put("a", Maps.newHashMap("b", 2.0))
        2. maps.put("b", Maps.newHashMap("a", 0.5))
     */

    HashMap<String, HashMap<String, Double>> maps;
    double[] answers;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        maps = new HashMap<>();
        answers = new double[queries.size()];
        buildGraph(equations, values);

        // query 를 순환하면서 dfs 수행
        for (int i = 0; i < queries.size(); i++) {
            String numerator = queries.get(i).get(0);
            String denominator = queries.get(i).get(1);

            // 분자나 분모가 maps 에 존재하지 않는다면 -1.0
            if (!maps.containsKey(numerator) || !maps.containsKey(denominator)) {
                answers[i] = -1.0;
            } else if (numerator.equals(denominator)) {
                // 두 값이 같다면 1.0
                answers[i] = 1.0;
            } else {
                // 그 외는 dfs 탐색
                Double tempAnswer = 1.0D;
                // 이건 왜 배열로 선언해야 하는가?
                double[] answer = {-1.0};
                HashSet<String> visited = new HashSet<>();
                dfs(numerator, denominator, tempAnswer, answer, visited);
                answers[i] = answer[0];
            }
        }

        return answers;
    }

    public void dfs(String start, String dest, double tempAnswer, double[] answer, HashSet<String> visited) {
        // 이미 방문했을 경우 return
        if (visited.contains(start)) return;
        // 시작 노드와 종료 노드가 같다면 탐색을 모두 종료한 것으로 간주하고 리턴
        if (start.equals(dest)) {
            answer[0] = tempAnswer;
            return;
        }

        // 방문 기록
        visited.add(start);

        // map
        for (Map.Entry<String, Double> entry : maps.get(start).entrySet()) {
            String next = entry.getKey();
            double weight = entry.getValue();
            dfs(next, dest, tempAnswer * weight, answer, visited);
        }
    }

    public void buildGraph(List<List<String>> equations, double[] values) {
        // 그래프 탐색을 위한 map 세팅
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String numerator = equation.get(0);
            String denominator = equation.get(1);
            double value = values[i];

            maps.putIfAbsent(numerator, new HashMap<>());
            maps.putIfAbsent(denominator, new HashMap<>());

            maps.get(numerator).put(denominator, value);
            maps.get(denominator).put(numerator, 1.0 / value);
        }
    }
}
