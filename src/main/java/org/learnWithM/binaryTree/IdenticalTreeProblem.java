package org.learnWithM.binaryTree;

public class IdenticalTreeProblem {

    public static boolean isIdenticalRecursiveMethod(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }

        return r1.data == r2.data && isIdenticalRecursiveMethod(r1.left, r2.left) && isIdenticalRecursiveMethod(r1.right, r2.right);
    }

    public static void main(String[] args) {
        // Representation of input binary tree 1
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);
        r1.left.left = new Node(4);

        // Representation of input binary tree 2
        //        1
        //       / \
        //      2   3
        //     /
        //    4
        Node r2 = new Node(1);
        r2.left = new Node(2);
        r2.right = new Node(3);
        r2.left.left = new Node(4);

        System.out.println(isIdenticalRecursiveMethod(r1, r2));
    }
}
