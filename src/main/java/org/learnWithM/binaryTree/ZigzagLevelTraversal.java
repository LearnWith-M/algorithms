package org.learnWithM.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ZigzagLevelTraversal {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        if(root != null){
            s1.add(root);
        }

        while (!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> subRes = new ArrayList<>();
            while (!s1.isEmpty()) {
                TreeNode curr = s1.pop();
                subRes.add(curr.val);
                if (curr.left != null) {
                    s2.add(curr.left);
                }
                if(curr.right != null){
                    s2.add(curr.right);
                }
            }
            if(!subRes.isEmpty()){
                res.add(subRes);
            }

            subRes = new ArrayList<>();
            while (!s2.isEmpty()){
                TreeNode curr = s2.pop();
                subRes.add(curr.val);

                if(curr.right!= null){
                    s1.add(curr.right);
                }
                if(curr.left != null){
                    s1.add(curr.left);
                }
            }
            if(!subRes.isEmpty()){
                res.add(subRes);
            }
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
//     [3,9,20,null,null,15,7]
        TreeNode rootNode = new TreeNode(3);
        rootNode.left = new TreeNode(9);
        rootNode.right = new TreeNode(20);
        rootNode.right.left = new TreeNode(15);
        rootNode.right.right = new TreeNode(7);

        zigzagLevelOrder(rootNode);
    }
}
