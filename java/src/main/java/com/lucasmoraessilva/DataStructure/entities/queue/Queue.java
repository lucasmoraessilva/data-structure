package com.lucasmoraessilva.DataStructure.entities.queue;

import com.lucasmoraessilva.DataStructure.entities.helpers.Node;

public class Queue {
    private int first;
    private int last;
    private Node[] elements;
    private int maxElements;
    private static int DEFAULT_MAX_ELEMENTS = 10;

    public Queue() {
        super();
        this.first = 0;
        this.last = 0;
        this.maxElements = Queue.DEFAULT_MAX_ELEMENTS;
        this.elements = new Node[DEFAULT_MAX_ELEMENTS];
    }

    public Queue(int maxElements) {
        super();
        this.first = 0;
        this.last = 0;
        this.maxElements = maxElements;
        this.elements = new Node[maxElements];
    }

    public boolean isFull() {
        return (this.last - this.first) == this.maxElements;
    }

    public boolean isEmpty() {
        return this.first == this.last;
    }

    public Node push(Node newNode) {
        if(!isFull()) {
            this.elements[this.last % this.maxElements] = new Node(newNode);
            this.last++;
        }

        return null;
    }

    public Node pop() {
        if(!isEmpty()) {
            Node firstNode = new Node(this.elements[this.first % this.maxElements]);
            this.elements[this.first % this.maxElements] = null;
            this.first++;
            return firstNode;
        }

        return null;
    }
}
