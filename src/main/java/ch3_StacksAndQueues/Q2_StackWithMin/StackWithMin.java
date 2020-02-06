package ch3_StacksAndQueues.Q2_StackWithMin;

public class StackWithMin {
    private StackNode top;

    public void push(int data) {
        if (top == null) {
            top = new StackNode(data, data);
        } else {
            int minValue = Math.min(top.data, data);
            StackNode tmp = new StackNode(data, minValue);
            tmp.next = top;
            top = tmp;
        }
    }

    public StackNode pop() {
        if (top == null)
            return null;
        StackNode tmp = top;
        top = top.next;
        return tmp;
    }

    public int getMin() {
        if (top == null)
            return Integer.MAX_VALUE;
        return top.min;
    }
}
