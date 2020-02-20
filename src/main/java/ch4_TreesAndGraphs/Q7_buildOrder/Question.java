package ch4_TreesAndGraphs.Q7_buildOrder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question {
    static Project[] findBuildOrder(String[] projects, String[][] dependencies) {
        Graph graph = buildGraph(projects, dependencies);
        return orderProjects(graph.getNodes());
    }

    static Graph buildGraph(String[] projects, String[][] dependencies) {
        Graph graph = new Graph();
        for (String project: projects) {
            graph.getOrCreateNode(project);
        }

        for (String[] dependency: dependencies) {
            graph.addEdge(dependency[0], dependency[1]);
        }

        return graph;
    }

    static Project[] orderProjects(ArrayList<Project> projects) {
        Project[] order = new Project[projects.size()];

        int endOfList = addNonDependent(order, projects, 0);

        int toBeProcessed = 0;
        while (toBeProcessed < order.length) {
            Project current = order[toBeProcessed];

            if (current == null) {
                return null;
            }

            ArrayList<Project> children = current.getChildren();
            for (Project child : children) {
                child.decrementDependencies();
            }

            endOfList = addNonDependent(order, children, endOfList);
            toBeProcessed++;
        }
        return order;
    }

    static int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
        for (Project project: projects) {
            if (project.getNumberDependencies() == 0) {
                order[offset] = project;
                offset++;
            }
        }
        return offset;
    }

    public static void main(String[] args) {
        String[] projects = {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = {new String[]{"a", "d"}, new String[]{"f", "b"}, new String[]{"b", "d"},
                new String[]{"f", "a"}, new String[]{"d", "c"}};
        Project[] res = findBuildOrder(projects, dependencies);
        for(Project project: res) {
            System.out.println(project.getName());
        }
    }
}
