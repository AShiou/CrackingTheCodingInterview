package ch3_StacksAndQueues.Q2_StackWithMin;

public class Question {
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        StackWIthNodeMin2 stack2 = new StackWIthNodeMin2();
        int[] array = {2, 1, 3, 1};
        for (int value : array) {
            stack.push(value);
            stack2.push(value);
            System.out.print(value + ", ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println("Popped " + stack.pop().data + ", " + stack2.pop());
            System.out.println("New min is " + stack.getMin() + ", " + stack2.min());
        }
    }
}
