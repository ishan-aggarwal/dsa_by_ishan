package linked_list;

import linked_list.model.ListNode;

// https://www.geeksforgeeks.org/find-first-node-of-loop-in-a-linked-list/
// https://leetcode.com/problems/linked-list-cycle/description/
public class DetectCycleInLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        head.setNext(two);
        two.setNext(three);
        three.setNext(four);
        four.setNext(five);
        five.setNext(two);

        // 1 -> 2 -> 3 -> 4 -> 5
        //      ^             |
        //     |--------------|
        ListNode cycleStart = findCycle(head);
        System.out.println(cycleStart == null ? "No Cycle In Linked List" : cycleStart.getData() + " is start of cycle in Linked List");

    }

    private static ListNode findCycle(ListNode head) {
        if (head == null || head.getNext() == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) break;
        }

        if (slow != fast) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow;
    }
}
