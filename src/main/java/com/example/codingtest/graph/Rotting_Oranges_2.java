package com.example.codingtest.graph;

public class Rotting_Oranges_2 {

    /*
        썩은 과일 기준으로 BFS 를 진행
        각 depth 마다 +1 을 해주고 최소값을 저장한다
        BFS 가 모두 끝난 후 신선한 과일이 남아있으면 -1 을 리턴
     */

    public int orangesRotting(int[][] grid) {
        int max_minute = 0;

        // 썩은 오렌지 위치 탐색




        // grid 내 신선한 오렌지가 남아있다면 -1 리턴
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }

        return max_minute;
    }
}
