package com.example.codingtest.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Add_Two_Numbers_Test {

    @Test
    void addTwoNumbers() {
        Add_Two_Numbers service = new Add_Two_Numbers();
        Add_Two_Numbers.ListNode l1_1 = new Add_Two_Numbers.ListNode(2);
        Add_Two_Numbers.ListNode l1_2 = new Add_Two_Numbers.ListNode(4);
        Add_Two_Numbers.ListNode l1_3 = new Add_Two_Numbers.ListNode(3);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        Add_Two_Numbers.ListNode l2_1 = new Add_Two_Numbers.ListNode(5);
        Add_Two_Numbers.ListNode l2_2 = new Add_Two_Numbers.ListNode(6);
        Add_Two_Numbers.ListNode l2_3 = new Add_Two_Numbers.ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        Add_Two_Numbers.ListNode result = service.addTwoNumbers(l1_1, l2_1);
    }
}