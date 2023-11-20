package com.example.algoritm.string;

import java.util.List;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {
        int maxVowel = 0, currentVowel = 0;
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < s.length(); i++) {
            // 슬라이딩 윈도우
            // 현재 위치가 모음이라면 vowel + 1;
            if (vowels.contains(s.charAt(i))) {
                currentVowel++;
            }

            // 현재 위치가 k 보다 크거나 같다면
            // 제외된 문자가 모음이라면 vowel - 1;
            if (i >= k && vowels.contains(s.charAt(i - k))) {
                currentVowel--;
            }

            maxVowel = Math.max(maxVowel, currentVowel);
        }

        return maxVowel;
    }
}
