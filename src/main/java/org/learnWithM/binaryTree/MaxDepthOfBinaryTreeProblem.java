package org.learnWithM.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTreeProblem {

    public static int findMaxDepthOfBinaryTreeIterative(Node root) {
        if (root == null) {
            return -1;
        }

        int lHeight = findMaxDepthOfBinaryTreeIterative(root.left);
        int rHeight = findMaxDepthOfBinaryTreeIterative(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }


    public static int findMaxDepthOfBinaryTreeBFS(Node root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node item = q.poll();
                if (item.left != null) {
                    q.add(item.left);
                }
                if (item.right != null) {
                    q.add(item.right);
                }
            }
            depth++;
        }
        return depth - 1;  // This includes root level as well. Need to reduce that.
    }


    public static void main(String[] args) {
        // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node node = new Node(12);
        node.left = new Node(8);
        node.right = new Node(18);
        node.left.left = new Node(5);
        node.left.right = new Node(11);

        System.out.println(findMaxDepthOfBinaryTreeIterative(node));
        System.out.println(findMaxDepthOfBinaryTreeBFS(node));
    }
}

