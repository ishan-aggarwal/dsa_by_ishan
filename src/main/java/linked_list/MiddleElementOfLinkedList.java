package linked_list;

import linked_list.model.ListNode;

// https://leetcode.com/problems/middle-of-the-linked-list/description/

public class MiddleElementOfLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        // since the list has two middle nodes 2 and 3
        // we return 3 as our answer

        ListNode middle = findMiddle(head);
        System.out.println(middle.getData());
    }

    private static ListNode findMiddle(ListNode head) {

//        int length = 0;
//        ListNode temp = head;
//        while (temp != null) {
//            temp = temp.getNext();
//            length++;
//        }
//
//        System.out.println(length);
//        temp = head;
//        for (int i = 0; i < (length/2) + 1; i++) {
//            temp = temp.getNext();
//        }
//
//        return temp;

        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;

    }
}
