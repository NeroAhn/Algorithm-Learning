package com.example.codingtest.tm;

public class Test2 {

    /*
        당신은 비행기 좌석 예약을 처리하고 있다. 비행기에는 1부터 N까지 번호가 매겨진 좌석이 N줄 있다. 아래 그림과 같이 각 줄에는 좌석이 열(10) 석 있다(글자 I를 제외하고 A부터 K까지 레이블이 지정됨).



    일부 좌석은 이미 예약되어 있다. 예약 좌석 목록은 "1A 3C 2B 20G 5A"와 같이 한 개의 공백으로 구분된 좌석 번호를 포함하는 문자열 S(길이 M)로 주어진다. S에 나열된 예약 좌석의 순서는 임의적이다.

    최대한 많은 4인 가족에게 좌석을 배정하시오. 4인 가족은 한 줄에서 서로 인접한 네 좌석을 사용하며, 통로를 사이에 둔 좌석들(예: 2C와 2D)은 서로 인접한 것으로 간주하지 않는다. 통로를 사이에 두고 가족을 분리할 수 있지만 이 경우에는 반드시 두 사람이 통로 양쪽에 앉아야 한다. 어떤 좌석도 한 가족 이상에게 배정할 수 없다.

    함수를 작성하시오:

    class Solution { public int solution(int N, String S); }

    줄 개수 N과 예약 좌석 목록 문자열 S가 주어졌을 때, 남은 미예약 좌석에 앉을 수 있는 4인 가족의 최대 수를 반환해야 한다.

    예를 들어 N = 2, S = "1A 2F 1C"일 때 함수는 2를 반환해야 한다. 다음 그림은 남은 좌석에 두 가족을 앉히는 방법 중 한 가지를 나타낸다.




    N = 1, S = "" (빈 문자열)일 때는 아래 그림과 같이 한 줄의 좌석에 최대 두 가족을 앉힐 수 있으므로 함수는 2를 반환해야 한다.




    N = 22, S = "1A 3C 2B 20G 5A"일 때 함수는 41를 반환해야 한다.

    다음과 같이 가정합니다:

    N은 [1..50] 범위의 정수입니다;
    M은 [0..1,909] 범위의 정수입니다;
    문자열 S는 한 개의 공백으로 구분된 유효 좌석 이름으로 구성된다;
    문자열 S에서 모든 좌석 번호는 최대 한 번 나타난다.
    제출한 테스트의 정확성에 중점을 두어 검토합니다. 제출한 테스트의 성능(퍼포먼스)은 평가에 영향을 주지 않습니다.
     */
    public int solution(int N, String S) {
        // 예약정보 문자열을 파싱하여 예약 정보 취합
        // 각 행마다 예약이 가능한 좌석 중 4인 좌석의 갯수 취합

        // 예약 정보
        boolean[][] reservation = getReservation(N, S);

        // row 별로 예약 확인 및 4인좌석 가능 여부 확인
        int possibleCount = 0;
        for (int i = 0; i < N; i++) {
            // A B C D E F G H J K
            // 가능한 케이스는 3가지
            // B C D E > left
            // D E F G > center
            // F G H J > rigth
            // 각 구역별로 모두 예약이 가능한지 체크
            boolean left = isPossibleReservation(reservation[i], 1, 4);
            boolean right = isPossibleReservation(reservation[i], 5, 8);
            boolean center = !left && !right && isPossibleReservation(reservation[i], 3, 6);

            if (left) possibleCount++;
            if (center) possibleCount++;
            if (right) possibleCount++;
        }

        return possibleCount;
    }

    private boolean[][] getReservation(int N, String S) {
        boolean[][] reservation = new boolean[N][10];
        if (!S.isEmpty()) {
            for(String reserveInfo : S.split(" ")) {
                int row = Integer.valueOf(reserveInfo.substring(0, reserveInfo.length() - 1)) - 1;
                int col = reserveInfo.charAt(reserveInfo.length() - 1) - 'A';
                if (col > 7) {
                    col--;
                }

                reservation[row][col] = true;

            }
        }

        return reservation;
    }

    private boolean isPossibleReservation(boolean[] row, int start, int end) {
        // start ~ end 사이에 하나라도 예약된 자리가 있다면 4인 배정 불가
        for (int i = start; i <= end; i++) {
            if (row[i]) return false;
        }
        return true;
    }
}
