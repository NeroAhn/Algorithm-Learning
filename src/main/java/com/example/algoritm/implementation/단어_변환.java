package com.example.algoritm.implementation;

import java.util.*;

public class 단어_변환 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/43163
     */
    public int solution(String begin, String target, String[] words) {
        // target 이 존재하지 않을 경우 0 리턴
        if (!isExist(words, target)) return 0;

        int minStep = words.length;
        // 각 단어별로 다음 단어인 경우에 bfs 수행
        for (String word : words) {
            if (isNextWord(begin, word)) {
                int step = bfs(new Word(word, 1), words, target);
                minStep = Math.min(minStep, step);
            }
        }

        return minStep;
    }

    private int bfs(Word current, String[] words, String target) {
        Set<String> visited = new HashSet<>();
        Queue<Word> queue = new LinkedList<>();
        queue.add(current);
        visited.add(current.text);
        while (!queue.isEmpty()) {
            Word next = queue.poll();
            if (next.text.equals(target)) {
                return next.step;
            }
            for (String word : words) {
                if (!visited.contains(word) && isNextWord(next.text, word)) {
                    queue.add(new Word(word, next.step + 1));
                    visited.add(word);
                }
            }
        }

        return 0;
    }

    private class Word {
        String text;
        int step;

        public Word(String current, int step) {
            this.text = current;
            this.step = step;
        }
    }

    private boolean isExist(String[] words, String target) {
        for (String word : words) {
            if (word.equals(target)) return true;
        }
        return false;
    }

    private boolean isNextWord(String current, String next) {
        char[] w = current.toCharArray();
        char[] t = next.toCharArray();
        int diffCount = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i] != t[i]) diffCount++;
        }
        if (diffCount == 1) return true;
        return false;
    }
}
