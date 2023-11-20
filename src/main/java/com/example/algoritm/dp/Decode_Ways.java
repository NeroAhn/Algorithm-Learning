package com.example.algoritm.dp;

/**
 * https://leetcode.com/problems/decode-ways/
 */
public class Decode_Ways {
    /*
        s = "226"
        case = (2 26), (22, 6), (2, 2, 6)
        이것도 dp 테이블로 각 문자열 위치에 가능한 케이스를 적재
        0번째 > 1로 초기화
        1번째 > 2 > 케이스 1개
        2번째
            > 한글자 경우 체크 > 2 > 여기까지 해독방법은 dp[1] 과 같다 >>> (2, 2)
            > 두글자 경우 체크 > 22 > 여기까지 해독방법은 dp[0] 과 같다 >>> (22)
            >> 위 두 케이스를 더한다 >>> 2
        3번째
            > 한글자 > 6 > 여기까지 해독방법은 dp[2] 와 같다 >>> (2, 2, 6) (22, 6)
            > 두글자 > 26 > 여기까지 해독방법은 dp[1] 와 같다 >>> (2, 26)
            >>> 총 3개


        "89"
        0번째 > 8 > 케이스 1
        1번째
            > 한글자인 경우 > 9 > 여기까지 해독 방법 개수는 0번째와 같다 >>> (8 9) 이므로
            > 두글자인 경우 > 89 > 해독 안됨



     */

    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        // 첫번째는 0으로 초기화
        dp[0] = 1;

        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= s.length(); i++) {
            int oneNumber = Integer.valueOf(s.substring(i - 1, i));
            int twoNumber = Integer.valueOf(s.substring(i - 2, i));

            if (oneNumber != 0) {
                dp[i] += dp[i - 1];
            }
            if (10 <= twoNumber && twoNumber <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }
}
