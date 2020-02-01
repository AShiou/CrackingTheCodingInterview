package ch2_LinkedList;

import library.LinkedListNode;

import java.util.Stack;

public class Q6_isPalidrome_stack {
    static boolean isPalidrome(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        Stack<Integer> stack = new Stack<Integer>();
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            int top = stack.pop().intValue();
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(8, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(7, null, lA2);
        LinkedListNode lA4 = new LinkedListNode(8, null, lA3);
        LinkedListNode lA5 = new LinkedListNode(9, null, lA4);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(2, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(3, null, lB2);

        System.out.println(lA1.print());
        System.out.println(isPalidrome(lA1));

        System.out.println(lB1.print());
        System.out.println(isPalidrome(lB1));

    }
}


