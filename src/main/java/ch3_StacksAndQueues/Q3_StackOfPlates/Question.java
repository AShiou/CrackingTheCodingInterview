package ch3_StacksAndQueues.Q3_StackOfPlates;

public class Question {
    public static void main(String[] args) {
        SetOfStacks set = new SetOfStacks(3);
        for (int i = 0; i < 34; i++) {
            set.push(i);
        }
        System.out.println(set.popAt(5));
        System.out.println(set.popAt(6));
    }
}
