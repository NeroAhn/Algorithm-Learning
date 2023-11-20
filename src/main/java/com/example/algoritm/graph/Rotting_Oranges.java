package com.example.algoritm.graph;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/rotting-oranges
 */
public class Rotting_Oranges {

    /*
        썩은 오렌지를 찾아서 해당 위치로부터
        동서남북 4방향으로 BFS 를 진행하면서 Depth 를 측정한 후에
        남아있는 신선한 오렌지가 없다면 해당 depth 리턴
        아니라면 -1 리턴
     */
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        LinkedList<int[]> queue = new LinkedList<>();
        // gird 를 탐색하며 썩은 오렌지가 있는 위치를 queue 에 넣는다
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }

        int maxStep = 0;
        int[][] direction = {{1,0}, {-1,0}, {0,-1}, {0,1}};
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            // 동서남북으로 이동
            for (int i = 0; i < 4; i++) {
                int next_m = current[0] + direction[i][0];
                int next_n = current[1] + direction[i][1];
                int next_step = current[2] + 1;
                // 이동이 가능한 곳이고
                if (isPossibleMove(next_m, next_n, m, n)) {
                    // 신선한 오렌지가 있다면
                    if (grid[next_m][next_n] == 1) {
                        // 해당 위치 오렌지 썩게 하고 이동
                        grid[next_m][next_n] = 2;
                        queue.add(new int[]{next_m, next_n, next_step});
                        // 최대 depth 기록
                        maxStep = Math.max(maxStep, next_step);
                    }
                }
            }
        }

        // BFS 탐색이 끝났으나 아직 신선한 오렌지가 있다면 -1 리턴
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }


        return maxStep;
    }

    public boolean isPossibleMove(int next_m, int next_n, int m, int n) {
        return next_m >= 0 && next_m < m && next_n >= 0 && next_n < n;
    }
}
