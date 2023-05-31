package org.example;

public class Node {
    int data;
    public Node left;
    public Node right;
    Node parent; // used in SimpleBinaryTree + red-black tree
    boolean color; // used in red-black tree

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
