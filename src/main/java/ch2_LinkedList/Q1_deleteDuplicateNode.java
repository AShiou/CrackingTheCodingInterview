package ch2_LinkedList;

import library.LinkedListNode;

import java.util.HashSet;
import java.util.Random;

public class Q1_deleteDuplicateNode {
    static void deleteDup(LinkedListNode head) {
        HashSet<Integer> set = new HashSet();
        LinkedListNode prev = null;
        LinkedListNode p = head;
        while (p != null) {
            if (set.contains(p.data)) {
                prev.next = p.next;
            } else {
                set.add(p.data);
                prev = p;
            }
            p = p.next;
        }
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
        deleteDup(head);
        System.out.println(head.print());
    }
}


