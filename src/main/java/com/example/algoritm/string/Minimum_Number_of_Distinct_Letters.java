package com.example.algoritm.string;

import java.util.Arrays;

public class Minimum_Number_of_Distinct_Letters {

    public int solution(String P, String Q) {
        if (P.equals(Q)) return P.length();
        int[] count = new int[26];
        for (int i = 0; i < P.length(); i++) {
            count[P.charAt(i) - 'a']++;
            count[Q.charAt(i) - 'a']++;
        }

        Arrays.sort(count);
        int remain = P.length();
        int min = 0;

        for (int i = 25; i >= 0; i--) {
            min++;
            remain -= count[i];
            if (remain <= 0) {
                break;
            }
        }

        return min;
    }
}
