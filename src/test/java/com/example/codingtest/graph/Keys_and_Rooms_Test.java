package com.example.codingtest.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Keys_and_Rooms_Test {

    @Test
    void canVisitAllRooms_1() {
        Keys_and_Rooms service = new Keys_and_Rooms();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1));
        rooms.add(List.of(2));
        rooms.add(List.of(3));
        rooms.add(List.of());
        boolean result = service.canVisitAllRooms(rooms);
        Assertions.assertEquals(true, result);
    }

    @Test
    void canVisitAllRooms_2() {
        Keys_and_Rooms service = new Keys_and_Rooms();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1,3));
        rooms.add(List.of(3,0,1));
        rooms.add(List.of(2));
        rooms.add(List.of(0));
        boolean result = service.canVisitAllRooms(rooms);
        Assertions.assertEquals(false, result);
    }
}