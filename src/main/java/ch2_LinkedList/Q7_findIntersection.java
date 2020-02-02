package ch2_LinkedList;

import library.LinkedListNode;

class Result {
    LinkedListNode tail;
    int length;
    Result(LinkedListNode tail, int length) {
        this.tail = tail;
        this.length = length;
    }
}

public class Q7_findIntersection {

    static LinkedListNode findIntersection(LinkedListNode list1, LinkedListNode list2) {
        if (list1 == null || list2 == null) return null;
        Result result1 = getTailAndSize(list1);
        Result result2 = getTailAndSize(list2);
        if (result1.tail != result2.tail)
            return null;
        if (result1.length > result2.length) {
            list1 = getKthNode(list1, result1.length - result2.length);
        } else if (result2.length > result1.length) {
            list2 = getKthNode(list2, result2.length - result1.length);
        }
        while (list1 != list2) {
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1;
    }

    static Result getTailAndSize(LinkedListNode list) {
        if (list == null) return null;
        int size = 1;
        while (list.next != null) {
            list = list.next;
            size++;
        }
        return new Result(list, size);
    }

    static LinkedListNode getKthNode(LinkedListNode list, int length) {
        while (length > 0 && list != null) {
            list = list.next;
            length--;
        }
        return list;
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
        LinkedListNode lB4 = new LinkedListNode(4, lA3, lB3);

        System.out.println(lA1.print());
        System.out.println(lB1.print());
        System.out.println(findIntersection(lA1, lB1).print());
    }
}


