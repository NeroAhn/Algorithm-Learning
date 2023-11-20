package com.example.codingtest.pratice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations {

    /*
        a       b       c
      d e f   d e f   d e f



     */
    List<String> result;
    Map<String, List<String>> phoneNumberMap;
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if ("".equals(digits)) return result;
        phoneNumberMap = buildPhoneNumberMap();

        recur(digits, 0, "");

        return result;

    }

    private void recur(String digits, int index, String combinations) {
        if (index == digits.length()) {
            result.add(combinations);
            return;
        }

        String word = digits.substring(index, index + 1);
        List<String> targetDisits = phoneNumberMap.get(word);
        for (String target : targetDisits) {
            combinations += target;
            recur(digits, index + 1, combinations);
            combinations = combinations.substring(0, combinations.length() - 1);
        }
    }

    private Map<String, List<String>> buildPhoneNumberMap() {
        Map<String, List<String>> maps = new HashMap<>();
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
