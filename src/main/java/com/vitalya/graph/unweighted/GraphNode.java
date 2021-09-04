package com.vitalya.graph.unweighted;

import java.util.List;

public class GraphNode<T> {
    public T value;
    public List<GraphNode<T>> children;

    public GraphNode(T value, List<GraphNode<T>> children) {
        this.value = value;
        this.children = children;
    }
}
