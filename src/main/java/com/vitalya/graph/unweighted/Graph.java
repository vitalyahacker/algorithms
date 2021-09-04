package com.vitalya.graph.unweighted;

import java.util.List;

public final class Graph<T> {
    public GraphNode<T> root;

    private Graph() {
    }

    public static Graph<Integer> initGraph() {
        Graph<Integer> graph = new Graph<>();
        graph.root = new GraphNode(7,
                List.of(
                        new GraphNode(6,
                                List.of(
                                        new GraphNode(33, List.of(
                                                new GraphNode(99, List.of())
                                        ))
                                )),
                        new GraphNode(2,
                                List.of(
                                        new GraphNode(33, List.of()),
                                        new GraphNode(45, List.of(
                                                new GraphNode(42, List.of())
                                        ))
                                )
                        )
                )
        );
        return graph;
    }
}

