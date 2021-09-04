package com.vitalya.graph.weighted;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public final class WeightedGraph<T> {
    public WeightedGraphNode<T> root;

    private WeightedGraph() {
    }

    public static WeightedGraph<Integer> init() {
        WeightedGraph<Integer> weightedGraph = new WeightedGraph<>();
        weightedGraph.root = new WeightedGraphNode<>(
                7,
                List.of(
                        Pair.of(3, new WeightedGraphNode<>(
                                99,
                                List.of(Pair.of(
                                                65,
                                                new WeightedGraphNode<>(5, List.of())
                                        ),
                                        Pair.of(47, new WeightedGraphNode<>(
                                                33, List.of()
                                        ))
                                )
                        )),
                        Pair.of(5, new WeightedGraphNode<>(
                                76, List.of()
                        ))
                )
        );
        return weightedGraph;
    }
}
