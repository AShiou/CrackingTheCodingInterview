package ch2_LinkedList;

import library.LinkedListNode;

import java.util.Random;

public class Q4_partition {
    static LinkedListNode partition(LinkedListNode head, int x) {
        LinkedListNode p = head;
        while (p.next != null) {
            if (p.next.data < x) {
                LinkedListNode tmp = p.next;
                p.next = p.next.next;
                tmp.next = head;
                head = tmp;
            } else {
                p = p.next;
            }
        }
        return head;
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
        LinkedListNode res = partition(head, 5);
        System.out.println(res.print());
    }
}


