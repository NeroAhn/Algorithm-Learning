package com.example.algoritm.pratice;

public class Jump_Game {

    /*
        nums = [2,3,1,1,4]
        dp [t][f][f][f][f]
        dp [t][t][f][f][f]
        dp [t][t][t][t][t]

        nums = [3,2,1,0,4]
        dp [t][f][f][f][f]
        dp [t][t][t][t][f]

        0 번재 부터 ~ n-1 번째 까지 순환하며
        현재 위치가 true 이면 >> 이전 단계에서 현재 단계까지 올 수 있는 경우의 수가 있다는 의미
        현재 위치부터 해당 숫자 step 까지 true 처리

        이후 dp[n] 를 리턴


        nums = [2,3,1,1,4]


        2 3 1 1 4
        [T][F][F][F][F]

     2 > [T][T][T][F][F]
     3 > [T][T][T][F][F]

     */
    public boolean canJump(int[] nums) {

        boolean[] dp = new boolean[nums.length];
        dp[0] = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (dp[i]) {
                for (int j = i; j <= i + nums[i]; j++) {
                    if (j < nums.length) {
                        dp[j] = true;
                    }
                }
            }
        }
        return dp[nums.length - 1];

    }
}
