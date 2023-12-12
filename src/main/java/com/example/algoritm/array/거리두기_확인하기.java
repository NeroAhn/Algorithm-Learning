package com.example.algoritm.array;

public class 거리두기_확인하기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/81302
     */
    // 상하좌우 검사용
    private static final int[] dy = {-1, 1, 0, 0};
    private static final int[] dx = {0, 0, -1, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getAnswer(places[i]);
        }

        return answer;
    }

    public int getAnswer(String[] places) {
        // 각 places[] 를 room[][] 형식으로 변경
        char[][] room = new char[places.length][];
        for (int i = 0; i < room.length; i++) {
            room[i] = places[i].toCharArray();
        }

        // 룸의 각 자리별 거리두기 검사
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                char current = room[y][x];
                // 응시자 일 시 상하좌우 검사
                if (current == 'P') {
                    for (int d = 0; d < 4; d++) {
                        int ny = y + dy[d];
                        int nx = x + dx[d];
                        // 유효한 범위 내에서만 체크
                        if (ny >= 0 && nx >= 0 && ny < room.length && nx < room[ny].length) {
                            // 상하좌우 중 응시자가 있을 경우 > 거리두기 안지킴
                            if (room[ny][nx] == 'P') return 0;
                            // 상하좌우 중 빈테이블이 있을 경우 > 2depth 위치 검사
                            if (room[ny][nx] == 'O') {
                                boolean isExistNextPerson = isExistNextPerson(room, ny, nx, getExclude(d));
                                if (isExistNextPerson) return 0;
                            }
                        }
                    }
                }
            }
        }

        return 1;
    }

    public int getExclude(int d) {
        switch (d) {
            case 0:
                return 1;
            case 1:
                return 0;
            case 2:
                return 3;
            case 3:
                return 2;
            default:
                return -1;
        }
    }

    public boolean isExistNextPerson(char[][] room, int y, int x, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int ny = y + dy[d];
            int nx = x + dx[d];
            // 유효한 범위 내에서만 체크
            if (ny >= 0 && nx >= 0 && ny < room.length && nx < room[ny].length) {
                if (room[ny][nx] == 'P') return true;
            }
        }

        return false;
    }
}
