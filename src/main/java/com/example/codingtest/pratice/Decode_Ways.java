package com.example.codingtest.pratice;

public class Decode_Ways {

    /*
            226
        2 의 경우의 수 > "B" > 1개
        dp[1][][]
        22 의 경우의 수 > "B B", V > 2개
        dp[1][2][]
        226 의 경우의 수 > "B B F", "VF", "B Z" > 3
        dp[1][2][3]
        최종 경우의 수 = 3개

        - 남아있는 숫자가 없다면 모든 숫자가 반환되이었다는 뜻이며 디코딩 방법을 하나 찾은 것 > return 1
        - 남아있는 숫자의 첫번째 자리가 0이라면 디코드 불가 > return 0
        - 숫자가 2자리 이상 남아있고 0 과 27 사이라면 케이스 2가지
     */
    public int numDecodings_dfs(String s) {
        int result = dfs(s, 0);
        return result;
    }

    private int dfs(String s, int idx) {
        if (idx == s.length() - 1) {
            return 1;
        }
        else if (s.substring(idx, idx + 1) == "0") {
            return 0;
        }
        else if (s.length() - idx >= 2 && Integer.valueOf(s.substring(idx, idx + 2)) < 27) {
            return dfs(s, idx + 1) + dfs(s, idx + 2);
        } else {
            return 0;
        }
    }
}
