package ch3_StacksAndQueues.Q2_StackWithMin;

public class StackNode {
    int data;
    StackNode next;
    int min;
    public StackNode(int data, int min) {
        this.data = data;
        this.min = min;
    }
}
