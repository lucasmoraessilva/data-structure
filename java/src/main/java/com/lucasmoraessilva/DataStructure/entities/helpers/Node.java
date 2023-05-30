package com.lucasmoraessilva.DataStructure.entities.helpers;

public class Node {
    private String data;

    public Node() {

    }

    public Node(String data) {
        this.data = data;
    }

    public Node(Node sourceNode) {
        this(sourceNode.getData());
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
