package ch3_StacksAndQueues.Q3_StackOfPlates;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class SetOfStacks {
    ArrayList<Stack> stacks = new ArrayList<Stack>();
    private int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    private Stack<Integer> getLastStack() {
        if (stacks.size() == 0) return null;
        return stacks.get(stacks.size() - 1);
    }

    public void push(int v) {
        Stack<Integer> last = getLastStack();
        if (last == null || last.size() >= capacity) {
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(v);
            stacks.add(stack);
        } else {
            last.push(v);
        }
    }

    public int pop() {
        Stack<Integer> last = getLastStack();
        if (last == null) throw new EmptyStackException();
        int v = last.pop();
        if (last.isEmpty())
            stacks.remove(stacks.size() - 1);
        return v;
    }

    public int popAt(int index) {
        if (index > stacks.size() - 1) throw new EmptyStackException();
        if (index == stacks.size() - 1)
            return pop();
        Stack<Integer> stack = stacks.get(index);
        if (stack.isEmpty()) throw new EmptyStackException();
        int v = stack.pop();
        leftshift(index);
        return v;
    }

    private void leftshift(int index) {
        for (int i = index + 1; i < stacks.size() - 1; i ++) {
            Stack<Integer> prev = stacks.get(i - 1);
            Stack<Integer> now = stacks.get(i);
            Stack<Integer> tmp = new Stack<Integer>();
            while (now.size() > 0) {
                tmp.push(now.pop());
            }
            if (tmp == null) throw new EmptyStackException();
            prev.push(tmp.pop());
            while (tmp.size() > 0) {
                now.push(tmp.pop());
            }
        }
        Stack last = getLastStack();
        if (last.size() == 0)
            stacks.remove(stacks.size() - 1);
    }
}
