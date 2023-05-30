package com.lucasmoraessilva.DataStructure.application;

import com.lucasmoraessilva.DataStructure.entities.helpers.Node;
import com.lucasmoraessilva.DataStructure.entities.queue.Queue;

public class DataStructure {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        Node node1 = new Node("Lucas");
        Node node2 = new Node("Lucas");
        Node node3 = new Node("Lucas");
        Node node4 = new Node("Lucas");

        queue.push(node1);
        queue.push(node2);
        queue.push(node3);
        queue.push(node4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(node1);
        queue.push(node2);
        queue.push(node3);
        queue.push(node4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue);
    }
}
