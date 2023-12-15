package com.example.algoritm.implementation;

import java.util.Stack;
import java.util.stream.Collectors;

public class 큰_수_만들기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/42883
     */

    public String solution(String number, int k) {
        int[] numbers = number.chars()
                .map(c -> c - '0')
                .toArray();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            // 제거해야 할 숫자가 남아있고 현재 검사하는 숫자보다 스택 위에 있는 숫자가 작을 경우 스택에서 해당 문자 제거
            while (k > 0 && !stack.isEmpty() && numbers[i] > stack.peek()) {
                stack.pop();
                k--;
            }

            stack.push(numbers[i]);
        }

        // 제거해야할 숫자가 남아있을 수 있을 경우 추가 제거
        while (k-- > 0) {
            stack.pop();
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
