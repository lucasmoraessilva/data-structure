package com.lucasmoraessilva.DataStructure.entities.stack;

import com.lucasmoraessilva.DataStructure.entities.helpers.Node;

public class Stack {
    private Node[] elements;
    private int size;
    private int maxElements;
    private static int DEFAULT_MAX_ELEMENTS = 10;

    public Stack() {
        super();
        this.size = 0;
        this.maxElements = Stack.DEFAULT_MAX_ELEMENTS;
        this.elements = new Node[Stack.DEFAULT_MAX_ELEMENTS];
    }

    public Stack(int maxElements) {
        super();
        this.size = 0;
        this.maxElements = maxElements;
        this.elements = new Node[maxElements];
    }

    public Node[] getElements() {
        return this.elements;
    }


    public int getSize() {
        return this.size;
    }

    public boolean isFull() {
        return this.size == this.maxElements;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Node push(Node newNode) {
        if(!isFull()) {
            this.elements[this.size] = new Node(newNode);
            this.size++;
            return this.elements[this.size - 1];
        }

        return null;
    }

    public Node pop() {
        if(!isEmpty()) {
            Node lastNode = new Node(this.elements[this.size - 1]);
            this.elements[this.size - 1] = null;
            this.size--;
            return lastNode;
        }

        return null;
    }
}
