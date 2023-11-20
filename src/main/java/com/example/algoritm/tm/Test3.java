package com.example.algoritm.tm;

public class Test3 {
    /*
        A domino is a rectangular tile divided into two square parts. There are between 1 and 6 dots on each of the parts.

There is an array A of length 2*N, representing N dominoes. Dominoes are arranged in a line in the order in which they appear in array A. The number of dots on the left and the right parts of the K-th domino are A[2*K] and A[2*K+1], respectively. For example, an array A = [2, 4, 1, 3, 4, 6, 2, 4, 1, 6] represents a sequence of five domino tiles: (2, 4), (1, 3), (4, 6), (2, 4), and (1, 6).



In a correct domino sequence, each pair of neighboring tiles should have the same number of dots on their adjacent parts. For example, tiles (2, 4) and (4, 6) form a correct domino sequence and tiles (2, 4) and (1, 3) do not.

What is the minimum number of domino tiles that must be removed from the sequence so that the remaining tiles form a correct domino sequence? It is not allowed to reorder or rotate the dominoes.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A representing a sequence of N domino tiles, returns the minimum number of tiles that must be removed so that the remaining tiles form a correct domino sequence.

Examples:

1. Given A = [2, 4, 1, 3, 4, 6, 2, 4, 1, 6], the function should return 3. The second and the last two dominoes should be removed. After this, the remaining dominoes are (2, 4) and (4, 6).



2. Given A = [5, 1, 2, 6, 6, 1, 3, 1, 4, 3, 4, 3, 4, 6, 1, 2, 4, 1, 6, 2], the function should return 7. The domino tiles that should remain are: (2, 6), (6, 1), (1, 2).

3. Given A = [1, 5, 3, 3, 1, 3], the function should return 2. No pair of dominoes can be connected without rotating or reordering them.

4. Given A = [3, 4], the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..50,000];
the length of array A is equal to 2*N;
each element of array A is an integer within the range [1..6].
     */

    /*
        1 ~ 6 사이의 점의 갯수가 표시된 도미노 타일
        인접한 도미노는 같은 수를 가져야 한다
        위 조건을 만족하기 위해 제거되어야 할 최소 도미노 갯수를 구하라
        2,4  1,3  4,6  2,4  1,6 의 경우
        1,3  2,4  1,6 제거 후 2,4  4,6 이 남게된다
        이전 도미노의 마지막 숫자가 다음 도미노의 첫번째 숫자와
        다를 경우 > 제거 카운트 + 1
        같은 경우 > skip
    */
    public int solution(int[] A) {
        // 도미노가 한개일 경우 제거할 도미노는 없으므로 0 리턴
        if (A.length == 2) return 0;

        int minRemoveCount = A.length;
        int dominoCount = A.length / 2;
        for(int i = 0; i < dominoCount - 1; i++) {
            System.out.print("i : " + i + " > ");
            int removeCount = 0;
            int prevNum = A[(i * 2) + 1];

            for (int j = 0; j < dominoCount; j++) {
                // 동일한 도미노는 제외
                if (i != j) {
                    if (prevNum != A[j * 2]) {
                        System.out.print(A[j * 2] + "," + A[j * 2 + 1] + " / ");

                        removeCount++;
                    } else {
                        // 제거가 안되었을 경우 이전 번호를 교체
                        prevNum = A[(j * 2) + 1];
                    }
                }
            }

            System.out.println(", removeCount : " + removeCount);

            minRemoveCount = Math.min(minRemoveCount, removeCount);
        }


        return minRemoveCount;
    }
}
