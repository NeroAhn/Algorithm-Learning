package com.example.algoritm.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
 */
public class Reorder_Routes_to_Make_All_Paths_Lead_to_the_City_Zero {
    /*
        connections = [[1,0],[1,2],[3,2],[3,4]]
        root 부터 그래프를 그리되, 역방향 노드는 음수로 넣는다.
        이 후 만든 그래프를 기준으로 dfs 탐색을 진행한다.
        해당 노드가 양수라면 부모 > 자식의 방향이고 이 때에는 방향을 바꿔줘야 하기 때문에 +1 을 해준다.
     */

    List<List<Integer>> maps;
    boolean[] visited;
    int answer;

    public int minReorder(int n, int[][] connections) {
        // 초기화
        answer = 0;
        visited = new boolean[n];
        maps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            maps.add(new ArrayList<>());
        }

        // 이 부분이 핵심
        // 연결 정보를 기반으로 정방향 / 역방향에 대한 정보를 만든다
        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];

            maps.get(a).add(b);     // 정방향
            maps.get(b).add(-a);    // 역방향
        }

        // 0번째(root) 부터 dfs 탐색
        dfs(0);

        return answer;
    }

    public void dfs(int current) {
        // 방문 기록
        visited[current] = true;

        // 현재 노드와 연결되어 있는 다음 노드들 정보
        for (int next : maps.get(current)) {
            // 음수가 있을 수 있으므로 절대값으로 방문기록 확인
            // 방문하지 않았다면
            if (!visited[Math.abs(next)]) {
                // 정방향이라면 역방향으로 바꿔야 하기 때문에 정답 + 1
                if (next >= 0) {
                    answer++;
                }
                // 다음 노드 dfs
                dfs(Math.abs(next));
            }
        }
    }
}
