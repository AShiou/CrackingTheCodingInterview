package ch2_LinkedList;

import library.LinkedListNode;

import java.util.Random;

public class Q2_nthToLast_2 {
    static LinkedListNode nthToLast(LinkedListNode head, int k) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1 == null) {
                return null;
            }
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0, null, null);
        LinkedListNode head = first;
        LinkedListNode second;
        Random ran = new Random();
        for (int i = 1; i < 10; i++) {
            second = new LinkedListNode(ran.nextInt(10), null, null);
            first.setNext(second);
            second.setPrevious(first);
            first = second;
        }
        System.out.println(head.print());
        LinkedListNode res = nthToLast(head, 3);
        System.out.println(res.print());
    }
}


