package ch3_StacksAndQueues;

import java.util.Random;
import java.util.Stack;

public class Q5_sortStack {

    static void sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();
        while (!s.isEmpty()) {
            int val = s.pop();
            while (!r.isEmpty() && r.peek() > val) {
                s.push(r.pop());
            }
            r.push(val);
        }
        while(!r.isEmpty()) {
            s.push(r.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int r = ran.nextInt(100);
            s.push(r);
        }

        sort(s);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
