package ch3_StacksAndQueues.Q4_QueueViaStacks;

import java.util.LinkedList;
import java.util.Queue;

public class Question {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println(myQueue.remove());
        myQueue.add(4);
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
    }
}
