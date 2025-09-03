package org.learnWithM.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class InorderTraversal {


//    Inorder Traversal  left -> root -> right

    public static List<Integer> inorderTraversalIterative(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.val);

            curr = curr.right;
        }
        return result;
    }
    public static void inorderTraversalRecursive(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversalRecursive(root.left);
        System.out.println(root.val);
        inorderTraversalRecursive(root.right);
    }

    public static void main(String[] args) {
        Integer[] root = {1, null, 2, 3};
        //Output should be [1,3,2]
        TreeNode rootNode = new TreeNode(1);
        rootNode.right = new TreeNode(2);
        rootNode.right.left = new TreeNode(3);
        inorderTraversalIterative(rootNode);
//        inorderTraversalRecursive(rootNode);

        Integer[] testRootTwo = {1,2,3,4,5,null,8,null,null,6,7,9};
    }
}
