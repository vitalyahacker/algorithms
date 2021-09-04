package com.vitalya.graph.weighted;

public class Dijkstra {
    public static void main(String[] args) {
        WeightedGraph<Integer> weightedGraph = WeightedGraph.init();
        findShortestPath(weightedGraph);
    }
}
