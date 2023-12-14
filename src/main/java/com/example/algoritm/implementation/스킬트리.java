package com.example.algoritm.implementation;

import java.util.*;

public class 스킬트리 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/49993
     */
    public int solution(String skill, String[] skill_trees) {
        return (int) Arrays.stream(skill_trees)
                // skill 에 포함되지 않는 문자들 모두 제거 (정규식 : [^CBD])
                .map(s -> s.replaceAll("[^" + skill + "]", ""))
                // skill 의 prefix 인지 체크
                .filter(skill::startsWith)
                // 개수 반환
                .count();
    }
}
