package com.example.algoritm.implementation;

import java.util.*;

public class 단속카메라 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/42884
     */

    public int solution(int[][] routes) {

        // 이동위치의 끝 구간을 기준으로 정렬
        Arrays.sort(routes, Comparator.comparingInt(route -> route[1]));

        // 설치한 카메라 개수
        int count = 0;
        // 마지막에 설치한 카메라 위치
        int last = Integer.MIN_VALUE;
        // 이동 구간 별로 순회
        for (int[] route : routes) {
            // 마지막에 설치한 카메라가 구간내에 있다면 skip
            if (last >= route[0] && last <= route[1]) continue;
            // 아니라면 카메라 설치
            last = route[1];
            count++;
        }

        return count;
    }
}
