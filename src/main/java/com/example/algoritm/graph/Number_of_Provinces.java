package com.example.algoritm.graph;

/**
 * https://leetcode.com/problems/number-of-provinces
 */
public class Number_of_Provinces {

    /*
        각 노드에는 현재 노드와 다른 노드 간의 연결 정보를 가지고 있다.
        isConnected[i][j] 가 1 일 경우 i번째 노드와 j번째 노드가 연결 되어 있다.
        각 노드별로 dfs 를 진행하면서 count 를 세보자
     */
    boolean[] visited;  // 방문 기록
    int provinceCount;  // 연결된 노드 묶음의 개수
    public int findCircleNum(int[][] isConnected) {
        visited = new boolean[isConnected.length];

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                provinceCount++;
                dfs(isConnected, i);
            }
        }

        return provinceCount;
    }

    private void dfs(int[][] isConnected, int current) {
        visited[current] = true;
        int[] connectInfos = isConnected[current];
        for (int i = 0; i < connectInfos.length; i++) {
            // 현재 위치가 아니고 연결되어 있다면 해당 노드로 이동
            if (current != i && connectInfos[i] == 1 && !visited[i]) {
                dfs(isConnected, i);
            }
        }
    }
}
