package com.example.algoritm.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 스킬트리_Test {

    @Test
    void solution() {
        스킬트리 service = new 스킬트리();
        String skill = "CBD";
        String[] skill_tree = {"BACDE", "CBADF", "AECB", "BDA"};
        int result = service.solution(skill, skill_tree);
        Assertions.assertEquals(2, result);
    }
}