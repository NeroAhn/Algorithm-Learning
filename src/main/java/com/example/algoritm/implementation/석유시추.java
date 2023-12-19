package com.example.algoritm.implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 석유시추 {

    // 상하좌우 이동을 위한 위치 정보
    private static final int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean[][] visited;
    // 석유 덩어리 정보 (열 시작위치, 열 끝위치, 석유 덩어리 크기)
    List<int[]> oilInfo = new ArrayList<>();

    public int solution(int[][] land) {
        // BFS 를 통한 석유 덩어리 정보 취합
        visited = new boolean[land.length][land[0].length];
        for (int n = 0; n < land.length; n++) {
            for (int m = 0; m < land[0].length; m++) {
                if (!visited[n][m] && land[n][m] == 1) {
                    oilInfo.add(bfs(land, n, m));
                }
            }
        }

        // 취합된 석유 덩어리 정보를 토대로 열의 위치별 석유 덩어리 정보 계산
        int max_oil = 0;
        for (int i = 0; i < land[0].length; i++) {
            int oil = 0;
            for (int j = 0; j < oilInfo.size(); j++) {
                if (oilInfo.get(j)[0] <= i && oilInfo.get(j)[1] >= i) {
                    oil += oilInfo.get(j)[2];
                }
            }
            max_oil = Math.max(max_oil, oil);
        }

        return max_oil;
    }

    private int[] bfs(int[][] land, int n, int m) {
        int min_m = land[0].length;
        int max_m = 0;
        int oilCount = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{n, m});
        visited[n][m] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            min_m = Math.min(min_m, current[1]);
            max_m = Math.max(max_m, current[1]);
            // 상하좌우 탐색
            for (int d = 0; d < 4; d++) {
                int next_n = current[0] + direction[d][0];
                int next_m = current[1] + direction[d][1];

                if (next_n >= 0 && next_n < land.length
                        && next_m >= 0 && next_m < land[0].length
                        && !visited[next_n][next_m] && land[next_n][next_m] == 1) {
                    oilCount++;
                    queue.add(new int[]{next_n, next_m});
                    visited[next_n][next_m] = true;
                }
            }
        }

        return new int[]{min_m, max_m, oilCount};
    }
}
