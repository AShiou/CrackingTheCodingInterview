package ch2_LinkedList;

import library.LinkedListNode;
import java.util.Random;

public class Q2_nthToLast {
    static LinkedListNode nthToLast(LinkedListNode head, int k) {
        LinkedListNode current = head;
        int count = 0;
        while (current != null) {
            current= current.next;
            count++;
        }
        if (count - k < 0)
            return null;
        current = head;
        for (int i = 0; i < count - k; i++) {
            current = current.next;
        }
        return current;
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


