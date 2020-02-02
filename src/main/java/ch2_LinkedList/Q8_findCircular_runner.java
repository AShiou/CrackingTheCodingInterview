package ch2_LinkedList;

import library.LinkedListNode;

public class Q8_findCircular_runner {

    static LinkedListNode findCircularBeginningNode(LinkedListNode list) {
        LinkedListNode slow = list;
        LinkedListNode fast = list;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = list;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(1, null, null);
        LinkedListNode lA2 = new LinkedListNode(2, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(3, null, lA2);
        LinkedListNode lA4 = new LinkedListNode(4, null, lA3);
        LinkedListNode lA5 = new LinkedListNode(5, null, lA4);
        LinkedListNode lA6 = new LinkedListNode(6, lA3, lA5);

        System.out.println(findCircularBeginningNode(lA1).data);

    }
}


