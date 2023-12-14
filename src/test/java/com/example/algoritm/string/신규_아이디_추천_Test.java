package com.example.algoritm.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 신규_아이디_추천_Test {

    @Test
    void solution() {
        신규_아이디_추천 service = new 신규_아이디_추천();
        String newId = "...!@BaT#*..y.abcdefghijklm";
        String result = service.solution(newId);
    }
}