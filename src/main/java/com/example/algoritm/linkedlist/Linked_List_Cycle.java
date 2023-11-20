package com.example.algoritm.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) return true;

            visited.add(head);
            head = head.next;
        }

        return false;
    }



    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
