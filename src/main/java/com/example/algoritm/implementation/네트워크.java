package com.example.algoritm.implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 네트워크 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/43162
     */
    public int solution(int n, int[][] computers) {
        int answer = 0;

        // 각 컴퓨터별 이웃 정보 취합
        List<Computer> computerInfos = new LinkedList<>();
        for (int i = 0; i < computers.length; i++) {
            List<Computer> neighbors = new LinkedList<>();
            for (int j = 0; j < computers[i].length; j++) {
                if (i != j && computers[i][j] == 1) {
                    neighbors.add(new Computer(j));
                }
            }

            computerInfos.add(new Computer(i, neighbors));
        }

        boolean[] visited = new boolean[n];
        // 각 요소 별로 BFS 탐색
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, computerInfos, visited);
                answer++;
            }
        }

        return answer;
    }

    // 컴퓨터의 이웃 정보 class
    private static class Computer {
        int number;
        List<Computer> neighbors;

        public Computer(int number) {
            this.number = number;
            this.neighbors = new LinkedList<>();
        }

        public Computer(int number, List<Computer> neighbors) {
            this.number = number;
            this.neighbors = neighbors;
        }
    }

    // 현재 위치 기준으로 이웃들의 정보를 기반으로 방문 기록을 하며 순회
    private void bfs(Integer number, List<Computer> computers, boolean[] visited) {
        // 현재 위치 큐에 넣고 방문 처리
        Queue<Integer> queue = new LinkedList<>();
        queue.add(number);
        visited[number] = true;

        while (!queue.isEmpty()) {
            // 현재 위치의 Computer 정보 획득
            Integer current = queue.poll();
            Computer current_computer = computers.get(current);

            // 현재 Computer 의 이웃 정보 기준으로 방문기록 + 순회
            for (Computer neighbor : current_computer.neighbors) {
                if (!visited[neighbor.number]) {
                    queue.add(neighbor.number);
                    visited[neighbor.number] = true;
                }
            }
        }
    }
}
