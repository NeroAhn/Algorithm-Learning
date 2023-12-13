package com.example.algoritm.string;

import java.util.ArrayList;
import java.util.List;

public class 문자열_압축 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/60057
     */
    public int solution(String s) {
        // s 의 길이는 1 ~ 1000
        int minLength = 1000;

        // 문자열을 1부터 s 의 length 만큼 자른다
        for (int i = 1; i <= s.length(); i++) {
            // 문자열 압축 후 가장 짧은 길이 선택
            minLength = Math.min(minLength, compress(s, i));
        }

        return minLength;
    }

    // 문자열을 압축하고 압축한 문자열의 길이 반환
    private int compress(String source, int length) {
        List<String> tokens = split(source, length);
        // 문자열을 비교하며 token 의 배열을 하나의 문자열로 압축
        StringBuilder sb = new StringBuilder();
        String lastToken = "";
        int count = 0;
        for (String token : tokens) {
            // 이전 문자와 동일하다면 카운트 증가
            if (token.equals(lastToken)) {
                count++;
            } else {
                // 이전 문자와 다르다면 이전까지 등장한 문자를 기준으로 압축
                // count 가 1보다 클 경우에만 count 추가
                if (count > 1) sb.append(count);
                // 이전 문자 추가
                sb.append(lastToken);

                // 새로운 문자를 이전 문자로 설정 & count 초기화
                lastToken = token;
                count = 1;
            }
        }

        // 마지막 문자는 추가 되지 않았기 때문에 한번더 체크
        if (count > 1) sb.append(count);
        sb.append(lastToken);

        return sb.length();
    }

    // 설정된 길이만큼 문자열을 잘라낸 배열 생성
    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if (endIndex > source.length()) endIndex = source.length();
            // 문자열을 startIndex ~ endIndex 까지 잘라 배열에 추가
            tokens.add(source.substring(startIndex, endIndex));
        }

        return tokens;
    }
}
