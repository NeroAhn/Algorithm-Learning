package com.example.algoritm.backtraking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
    https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class Phone_keypad {

    /*
        Input: digits = "23"
        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     */

    HashMap<String, List<String>> maps;
    List<String> results;
    public List<String> letterCombinations(String digits) {
        // 숫자 키패드에 매칭되는 문자열 세팅
        maps = buildMap();
        // 조합 가능한 문자열을 담기 위한 array list
        results = new ArrayList<>();

        // DFS 탐색 > 시작은 0번째 인덱스와 빈 문자열
        backtracking(digits, 0, "");

        return results;
    }

    public void backtracking(String digits, Integer index, String letter) {
        // Base Case
        // 현재 탐색중인 숫자 위치가 입력된 숫자의 마지막이라면
        if (index == digits.length()) {
            // 빈 문자열이 아닐 경우 결과 array list 에 추가
            if (!"".equals(letter)) {
                results.add(letter);
            }
            return;
        }

        // 입력된 숫자 중 첫번째(index 에 해당하는) 숫자 추출
        String num = String.valueOf(digits.toCharArray()[index]);
        // 해당 숫자에 매칭되는 알파벳 문자열 list 조회
        List<String> targetStrs = maps.get(num);
        // 각 알파벳 마다 DFS + 백트래킹 진행
        for (String str : targetStrs) {
            // letter 는 참조 타입이므로 동일한 메모리 주소를 가르킨다.
            // 현재 알파벳을 더해주고
            letter += str;
            // 재귀 호출 > 다음 index 와 letter 를 넘긴다
            backtracking(digits, index + 1, letter);
            // 이 부분이 백트래킹 > 마지막에 더해준 문자를 제거한다
            letter = letter.substring(0, letter.length() - 1);
        }
    }

    private HashMap<String, List<String>> buildMap() {
        maps = new HashMap<>();
        maps.put("2", List.of("a", "b", "c"));
        maps.put("3", List.of("d", "e", "f"));
        maps.put("4", List.of("g", "h", "i"));
        maps.put("5", List.of("j", "k", "l"));
        maps.put("6", List.of("m", "n", "o"));
        maps.put("7", List.of("p", "q", "r", "s"));
        maps.put("8", List.of("t", "u", "v"));
        maps.put("9", List.of("w", "x", "y", "z"));
        return maps;
    }
}
