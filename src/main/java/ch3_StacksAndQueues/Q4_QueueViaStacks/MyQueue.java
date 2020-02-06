package ch3_StacksAndQueues.Q4_QueueViaStacks;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MyQueue {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    public void add(int val) {
        in.push(val);
    }

    public int remove() {
        shiftStacks();
        return out.pop();
    }

    private void shiftStacks() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }

    public int peek() {
        shiftStacks();
        return out.peek();
    }

    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }
}
