package com.example.algoritm.implementation;

public class 타겟_넘버 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/43165
     */
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int depth, int sum) {
        // 탈출 조건
        // 현재 depth 가 마지막 이라면 현재까지의 합계가 target 과 같은지 확인 후 리턴
        if (depth == numbers.length ) {
            if (target == sum) return 1;
            else return 0;
        }

        int answer = 0;
        answer += dfs(numbers, target, depth + 1, sum + numbers[depth]);
        answer += dfs(numbers, target, depth + 1, sum - numbers[depth]);
        return answer;
    }
}
