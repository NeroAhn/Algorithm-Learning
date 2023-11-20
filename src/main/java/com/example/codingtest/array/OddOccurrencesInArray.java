package com.example.codingtest.array;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int a : A) {
//            if (map.containsKey(a)) {
//                map.put(a, map.get(a) + 1);
//            } else {
//                map.put(a, 1);
//            }
//        }
//
//        for (int key : map.keySet()) {
//            if (map.get(key) % 2 != 0) return key;
//        }
//
//        return -1;

        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number;
        }
        return unpaired;
    }
}
