package com.example.algoritm.string;

public class Valid_Palindrome {

    /*
        문자열을 소문자로 치환 & 공백 제거 후
        포인터를 두개 (제일 앞과 뒤) 두어 비교
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }

        String str = sb.toString();
        int start = 0, end = str.length() - 1;
        while (start <= end) {
            char firstChar = str.charAt(start);
            char endChar = str.charAt(end);
            if (firstChar != endChar) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
