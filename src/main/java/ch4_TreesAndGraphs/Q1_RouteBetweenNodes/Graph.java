package ch4_TreesAndGraphs.Q1_RouteBetweenNodes;

import java.util.LinkedList;

public class Graph {
    Node[] nodes;

    Graph(Node[] nodes) {
        this.nodes = nodes;
    }

    boolean search(Node start, Node end) {
        if (start == end) return true;
        LinkedList<Node> q = new LinkedList<Node>();
        for (Node u: nodes) {
            u.state = State.Unvisited;
        }
        q.add(start);
        Node u;
        while (!q.isEmpty()) {
            u = q.removeFirst();
            if (u.getAdjacent() != null) {
                for (Node v: u.getAdjacent()) {
                    System.out.println(v.name);
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }
}
