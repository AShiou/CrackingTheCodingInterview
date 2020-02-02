package ch2_LinkedList;

import library.LinkedListNode;

public class Q6_isPalidrome {
    static boolean isPalidrome(LinkedListNode head) {
        LinkedListNode reversed = reverse(head);
        return isEqual(head, reversed);
    }

    static LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode p = null;
        while (head != null) {
            LinkedListNode tmp = new LinkedListNode();
            tmp.data = head.data;
            tmp.next = p;
            p = tmp;
            head = head.next;
        }
        return p;
    }

    static boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
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


