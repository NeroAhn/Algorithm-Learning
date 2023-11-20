package com.example.codingtest.sliding_window;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

    /*
        슬라이딩 윈도우를 이용하여 k 만큼의 문자열 내에 모음이 몇개인지 체크
     */
    public int maxVowels(String s, int k) {
        int vowel = 0;
        for(int i =0; i< k; i++)
            if(isVowel(s.charAt(i))) vowel++;
        int max = vowel;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))) vowel++;
            if(isVowel(s.charAt(i-k))) vowel--;
            max = Math.max(max, vowel);
        }
        return max;
    }

    private boolean isVowel(char c){
        if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) return true;
        return false;
    }
}
