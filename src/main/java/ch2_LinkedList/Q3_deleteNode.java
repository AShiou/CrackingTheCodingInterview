package ch2_LinkedList;

import library.LinkedListNode;

import java.util.Random;

public class Q3_deleteNode {
    static boolean deleteNode(LinkedListNode node) {
        if (node == null || node.next == null)
            return false;
        LinkedListNode tmp = node.next;
        node.data = tmp.data;
        node.next = tmp.next;
        return true;
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
        deleteNode(head.next.next.next.next.next);
        System.out.println(head.print());
    }
}


