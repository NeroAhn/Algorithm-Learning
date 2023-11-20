package com.example.codingtest.graph;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/nearest-exit-from-entrance-in-maze
 */
public class Nearest_Exit_from_Entrance_in_Maze {

    /*
        maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]]
        entrance = [1,2]
        현재 위치(entrance) 로 부터 경계에 있는 출구까지 가장 적은 이동 단계
        가장 적은 이동 단계를 구해야 하므로 BFS 탐색을 진행한다.
        + 는 벽이므로 이동할 수 없다
        이동은 동서남북 방향으로
        출구의 조건
            - entrance 가 아니고
            - 해당 셀의 위치가 x 또는 y 의 경계에 있어야 한다.
                > (x = 0 or y = 0 or x = height - 1 or y = width - 1)
     */
    public int nearestExit(char[][] maze, int[] entrance) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int width = maze[0].length;
        int height = maze.length;
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        LinkedList<Position> queue = new LinkedList<>();
        queue.add(new Position(entrance[1], entrance[0], 0));
        visited[entrance[0]][entrance[1]] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();
            // 출구 도착 시 loop 탈출
            if (isExit(current.x, current.y, width, height, entrance)) {
                return current.step;
            }

            // 동서남북 탐색
            for (int i = 0; i < 4; i++) {
                int next_x = current.x + dx[i];
                int next_y = current.y + dy[i];

                // 갈수 있는 곳인지 체크
                if (isPossibleMove(next_x, next_y, width, height, maze) && !visited[next_y][next_x]) {
                    visited[next_y][next_x] = true;
                    queue.add(new Position(next_x, next_y, current.step + 1));
                }
            }

        }
        return -1;
    }

    public class Position {
        int x;
        int y;
        int step;

        public Position(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public boolean isExit(int x, int y, int width, int height, int[] entrance) {
        return (entrance[0] != y || entrance[1] != x)
        && (x == 0 || y == 0 || x == width - 1 || y == height - 1);
    }

    public boolean isPossibleMove(int x, int y, int width, int height, char[][] maze) {
        return x >= 0 && x < width && y >= 0 && y < height && maze[y][x] == '.';
    }
}
