package ch2_LinkedList;

import library.LinkedListNode;

import java.util.HashSet;

public class Q8_findCircular {

    static LinkedListNode findCircularBeginningNode(LinkedListNode list) {
        HashSet<LinkedListNode> set = new HashSet<LinkedListNode>();
        while (list != null) {
            if (set.contains(list)) {
                return list;
            } else {
                set.add(list);
            }
            list = list.next;
        }
        return null;
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


