package ch4_TreesAndGraphs.Q1_RouteBetweenNodes;

public class Node {
    String name;
    Node[] children;
    State state;

    Node(String name, Node[] children) {
        this.name = name;
        this.children = children;
    }

    public Node[] getAdjacent() {
        return children;
    }

}
