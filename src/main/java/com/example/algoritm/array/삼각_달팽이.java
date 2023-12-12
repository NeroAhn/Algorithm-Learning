package com.example.algoritm.array;

public class 삼각_달팽이 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/68645
     */
    public int[] solution(int n) {
        // 2차원 배열 선언
        int[][] map = new int[n][n];

        // 시작 위치
        int x = 0, y = 0;
        // 시작 숫자
        int num = 1;

        while (true) {
            // 아래로 이동 하며 숫자 채우기
            while (true) {
                map[y][x] = num++;
                // 아래로 이동할 수 없다면 break
                if (isPossibleToDown(map, x, y, n))
                    y += 1;
                else
                    break;
            }

            // 오른쪽으로 이동할 수 있다면 한칸 이동
            // 이동할 수 없다면 break
            if (isPossibleToRight(map, x, y, n)) {
                x += 1;
            } else {
                break;
            }

            // 오른쪽으로 이동
            while (true) {
                map[y][x] = num++;
                // 오른쪽으로 이동할 수 없다면 break
                if (isPossibleToRight(map, x, y, n)) {
                    x += 1;
                } else {
                    break;
                }
            }

            // 왼쪽 위로 이동할 수 있다면 한칸 이동
            // 이동할 수 없다면 break
            if (isPossibleToLeftUp(map, x, y, n)) {
                x -= 1;
                y -= 1;
            } else {
                break;
            }

            // 왼쪽 위로 이동
            while (true) {
                map[y][x] = num++;
                // 왼쪽 위로 이동할 수 있다면 한칸 이동
                // 이동할 수 없다면 break
                if (isPossibleToLeftUp(map, x, y, n)) {
                    x -= 1;
                    y -= 1;
                } else {
                    break;
                }
            }

            if (isPossibleToDown(map, x, y, n)) {
                y += 1;
            } else {
                break;
            }
        }

        // 1차원 배열로 변환
        int[] result = new int[num - 1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = map[i][j];
            }
        }

        return result;
    }

    // 아래로 이동 가능 여부
    private boolean isPossibleToDown(int[][] map, int x, int y, int n) {
        return y + 1 < n && map[y + 1][x] == 0;
    }

    // 오른쪽 이동 가능 여부
    private boolean isPossibleToRight(int[][] map, int x, int y, int n) {
        return x + 1 < n && map[y][x + 1] == 0;
    }

    // 왼쪽 위 이동 가능 여부
    private boolean isPossibleToLeftUp(int[][] map, int x, int y, int n) {
        return x - 1 >= 0 && y - 1 >= 0 && map[y - 1][x - 1] == 0;
    }
}
