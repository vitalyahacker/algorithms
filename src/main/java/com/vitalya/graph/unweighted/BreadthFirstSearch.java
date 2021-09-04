package com.vitalya.graph.unweighted;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        var breadthFirstSearch = new BreadthFirstSearch();
        var graph = Graph.initGraph();
        var isPresent = breadthFirstSearch.breadthFirstSearch(graph, 42);
        System.out.println(isPresent);
    }

    public boolean breadthFirstSearch(Graph<Integer> graph, int value) {
        Queue<GraphNode<Integer>> nodesQueue = new LinkedList<>();
        nodesQueue.add(graph.root);

        while (!nodesQueue.isEmpty()) {
            GraphNode<Integer> currentNode = nodesQueue.poll();
            if (currentNode.value == value) {
                return true;
            } else {
                nodesQueue.addAll(currentNode.children);
            }
        }

        return false;
    }
}
