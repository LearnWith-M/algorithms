package org.learnWithM.binaryTree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }


}
