package com.vitalya.graph.weighted;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class WeightedGraphNode<T> {
    public T value;
    public List<Pair<Integer, WeightedGraphNode<T>>> children;

    public WeightedGraphNode(T value, List<Pair<Integer, WeightedGraphNode<T>>> children) {
        this.value = value;
        this.children = children;
    }
}
