package com.example.algoritm.linkedlist;

import org.junit.jupiter.api.Test;

class Reverse_Linked_List_Test {

    @Test
    void reverseList() {
        Reverse_Linked_List service = new Reverse_Linked_List();
        Reverse_Linked_List.ListNode one = new Reverse_Linked_List.ListNode(1);
        Reverse_Linked_List.ListNode two = new Reverse_Linked_List.ListNode(2);
        Reverse_Linked_List.ListNode three = new Reverse_Linked_List.ListNode(3);
        Reverse_Linked_List.ListNode four = new Reverse_Linked_List.ListNode(4);
        Reverse_Linked_List.ListNode five = new Reverse_Linked_List.ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        Reverse_Linked_List.ListNode resultNode = service.reverseList(one);

    }
}