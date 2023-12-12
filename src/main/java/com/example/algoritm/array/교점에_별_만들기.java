package com.example.algoritm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 교점에_별_만들기 {
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/87377
     */
    public String[] solution(int[][] line) {
        ArrayList<Point> points = new ArrayList<>();

        // 이중 for 문으로 두 직선 간 교점 구하기 반복
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point point = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if (point != null) {
                    points.add(point);
                }
            }
        }

        // 2차원 배열 크기를 구하기 위한 최대값, 최소값 확인
        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);

        char[][] arr = new char[height][width];
        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        // 지정된 좌표에 별 찍기
        for (Point point : points) {
            // 최소한의 크기로 신규 배열을 선언했기 때문에
            // x 와 y 좌표를 다시 계산해야 함.
            int x = (int) (point.x - minPoint.x);
            int y = (int) (maxPoint.y - point.y);
            arr[y][x] = '*';
        }

        // 문자열 배열로 변환 후 반환
        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }


    private static class Point {
        public final long x, y;
        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    // 두 직선 간 교점의 좌표 구하기
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        // 교점 구한 후 반환. 정수 좌표만

        double x = (double) (b1*c2 - c1*b2) / (a1*b2 - b1*a2);
        double y = (double) (c1*a2 - a1*c2) / (a1*b2 - b1*a2);
        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    // 저장된 좌표들에 대해 x, y 좌표의 최대값, 최소값 구하기
    private Point getMinPoint(List<Point> points) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        for (Point point : points) {
            minX = Math.min(minX, point.x);
            minY = Math.min(minY, point.y);
        }

        return new Point(minX, minY);
    }

    private Point getMaxPoint(List<Point> points) {
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;

        for (Point point : points) {
            maxX = Math.max(maxX, point.x);
            maxY = Math.max(maxY, point.y);
        }

        return new Point(maxX, maxY);
    }
}
