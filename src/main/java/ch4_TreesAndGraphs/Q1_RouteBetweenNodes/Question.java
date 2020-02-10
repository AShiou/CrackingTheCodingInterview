package ch4_TreesAndGraphs.Q1_RouteBetweenNodes;

public class Question {

    public static void main(String[] args) {
        Node n5 = new Node("e", null);
        Node n4 = new Node("d", null);
        Node[] link3 = {n5};
        Node n3 = new Node("c", link3);
        Node[] link2 = {n3, n4};
        Node n2 = new Node("b", link2);
        Node[] link1 = {n2, n3};
        Node n1 = new Node("a", link1);
        Node[] graphNodes = {n1, n2, n3, n4, n5};
        Graph g = new Graph(graphNodes);

        System.out.println(g.search(n2, n5));

        Node a5 = new Node("e", null);
        Node a4 = new Node("d", null);
        Node[] linka3 = {a5};
        Node a3 = new Node("c", linka3);
        Node[] linka2 = {a4};
        Node a2 = new Node("b", linka2);
        Node[] linka1 = {a2, a3};
        Node a1 = new Node("a", linka1);
        Node[] newGraphNodes = {a1, a2, a3, a4, a5};
        Graph newG = new Graph(newGraphNodes);

        System.out.println(newG.search(a2, a5));

    }
}
