package com.example.codingtest.graph;

import java.util.List;

/**
 * https://leetcode.com/problems/keys-and-rooms
 */
public class Keys_and_Rooms {

    /*
        각 방에 들어가 열쇠에 해당하는 다른방에 접근하여 방문 기록을 한다. (DFS)
        DFS 가 종료된 이후 visited 를 확인하여 모두 방문했으면 true 아니면 false 를 리턴한다.
        각 방의 방문기록 (visited)
     */
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        dfs(rooms, 0);
        for (boolean v : visited) {
            if (!v) return false;
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, Integer current) {
        visited[current] = true;
        List<Integer> keys = rooms.get(current);
        for (Integer key : keys) {
            if (!visited[key]) dfs(rooms, key);
        }
    }
}
