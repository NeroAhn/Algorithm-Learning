package com.example.codingtest.linkedlist;

public class Merge_Two_Sorted_Lists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = null;

        ListNode node1 = list1;
        ListNode node2 = list2;

        while (node1 != null || node2 != null) {
            if (node1.val < node2.val) {
                if (newHead == null) {
                    newHead = node1;
                }
                // node1 을 next 로 이동
                ListNode next = node1.next;
                node1.next = node2;
                node1 = next;
            } else {
                if (newHead == null) {
                    newHead = node2;
                }
                ListNode next = node2.next;
                node2.next = node1;
                node2 = next;
            }
        }

        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
