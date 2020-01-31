package ch2_LinkedList;

import library.LinkedListNode;

public class Q5_linkedListSum_2 {
    static void addLists(LinkedListNode a, LinkedListNode b) {
        int carry = 0;
        int sum = 0;
        LinkedListNode prev = null;
        while (a != null || b != null) {
            if (a != null)
                sum = sum + a.data;
            if (b != null)
                sum = sum + b.data;
            sum = sum + carry;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
                sum = 0;
            }
            if (a != null) {
                a. data = sum;
                prev = a;
            } else {
                LinkedListNode tmp = new LinkedListNode();
                tmp.data = sum;
                tmp.next = null;
                prev.next = tmp;
            }
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;
        }
        if (carry != 0) {
            LinkedListNode tmp = new LinkedListNode();
            tmp.data = carry;
            tmp.next = null;
            prev.next = tmp;
        }
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        System.out.println(lA1.print());
        System.out.println(lB1.print());
        addLists(lA1, lB1);
        System.out.println(lA1.print());
    }
}
