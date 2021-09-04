package com.vitalya.easy;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (true) {
            if (fastPointer == null) return false;
            if (fastPointer.next == null) return false;

            if (fastPointer == slowPointer) return true;
            if (fastPointer.next == slowPointer) return true;

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
