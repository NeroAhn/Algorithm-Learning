package com.example.algoritm.string;

public class 신규_아이디_추천 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/72410
     */
    public String solution(String newId) {
        // 1. 모든 대문자를 소문자로 치환
        newId = newId.toLowerCase();

        // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 를 제외한 모든 문자 제거
        newId = newId.replaceAll("[^a-z0-9\\-_.]", "");

        // 3. 마침표(.) 가 2번 이상 연속된 부분을 하나의 마침표로 치환
        newId = newId.replaceAll("[.]{2,}", ".");

        // 4. 마침표(.) 가 처음이나 끝에 위치한다면 제거
        newId = newId.replaceAll("^[.]|[.]$", "");

        // 5. 빈 문자열이면 "a" 대입
        if (newId.isEmpty()) newId = "a";

        // 6. 16자 이상이면 첫 15개 문자를 제외한 나머지 문자 제거
        // 만약 제거 후 마지막이 마침표라면 마침표도 제거
        if (newId.length() >= 16) {
            newId = newId.substring(0, 15);
            newId = newId.replaceAll("[.]$", "");
        }

        // 7. 2자 이하라면 마지막 문자를 길이가 3이 될때까지 반복하여 붙인다
        if (newId.length() <= 2) {
            char last = newId.charAt(newId.length() - 1);
            while (newId.length() < 3) {
                newId += last;
            }
        }

        return newId;
    }
}
