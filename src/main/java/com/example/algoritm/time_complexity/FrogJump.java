package com.example.algoritm.time_complexity;

public class FrogJump {

    public int solution(int X, int Y, int D) {
        return (Y - X) % D > 0 ? ((Y - X) / D) + 1 : (Y - X) / D;
    }
}
