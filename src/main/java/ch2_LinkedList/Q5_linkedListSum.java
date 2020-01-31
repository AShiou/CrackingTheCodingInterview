package ch2_LinkedList;

import library.LinkedListNode;

public class Q5_linkedListSum {
    static LinkedListNode addLists(LinkedListNode a, LinkedListNode b) {
        int aValue = 0;
        int bValue = 0;
        int aMultiplier = 1;
        int bMultiplier = 1;
        while (a != null) {
            aValue = aValue + a.data * aMultiplier;
            aMultiplier = aMultiplier * 10;
            a = a.next;
        }
        while (b != null) {
            bValue = bValue + b.data * bMultiplier;
            bMultiplier = bMultiplier * 10;
            b = b.next;
        }
        int sum = aValue + bValue;
        System.out.println(sum);
        LinkedListNode head = null;
        LinkedListNode p = null;
        while (sum != 0) {
            LinkedListNode tmp = new LinkedListNode();
            tmp.data = sum % 10;
            tmp.next = null;
            sum = sum / 10;
            if (head == null) {
                head = tmp;
                p = head;
            } else {
                p.next = tmp;
                p = p.next;
            }
        }
        return head;
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
        LinkedListNode res = addLists(lA1, lB1);
        System.out.println(res.print());
    }
}


