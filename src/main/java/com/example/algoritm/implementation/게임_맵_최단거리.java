package com.example.algoritm.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/1844
     */
    public int solution(int[][] maps) {
        // 시작 위치가 벽인 경우 -1 리턴
        if (maps[0][0] == 0) return -1;
        return bfs(maps, new Position(0, 0, 1));
    }

    private int bfs(int[][] maps, Position position) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<Position> queue = new LinkedList<>();
        queue.add(position);
        visited[position.y][position.x] = true;
        while (!queue.isEmpty()) {
            Position current = queue.poll();
            // 현재 위치가 도착 위치라면 현재 step 리턴
            if (current.y == n - 1 && current.x == m - 1) {
                return current.step;
            }

            // 현재 위치 기준으로 동서남북 이동
            for (int i = 0; i < 4; i++) {
                int next_x = current.x + dx[i];
                int next_y = current.y + dy[i];
                // 이동 가능한 곳인지 체크
                if (isPossibleToMove(maps, visited, next_x, next_y)) {
                    queue.add(new Position(next_y, next_x, current.step + 1));
                    visited[next_y][next_x] = true;
                }
            }
        }

        return -1;
    }

    private boolean isPossibleToMove(int[][] maps, boolean[][] visited, int x, int y) {
        // 이동할 수 있는 곳은 지도 내 지역 & 미방문 & 벽이 아닌 곳
        return y >= 0 && y < maps.length && x >= 0 && x < maps[0].length
        && !visited[y][x] && maps[y][x] == 1;
    }

    // 위치 정보와 step 정보
    private class Position {
        int y;
        int x;
        int step;

        public Position(int y, int x, int step) {
            this.y = y;
            this.x = x;
            this.step = step;
        }
    }
}


