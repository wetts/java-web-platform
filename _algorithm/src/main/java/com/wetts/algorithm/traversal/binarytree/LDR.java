package com.wetts.algorithm.traversal.binarytree;

import java.util.Stack;

/**
 * 二叉树中序遍历
 *
 * @author wetts
 * @create 2016-08-05
 */
public class LDR {

    public static void recursion(TreeNode node) {
        if (node == null) {
            return;
        } else {
            recursion(node.left);
            System.out.println(node.val);
            recursion(node.right);
        }
    }

    public void nonRecursion(TreeNode biTree) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (biTree != null || !stack.isEmpty()) {
            while (biTree != null) {
                stack.push(biTree);
                biTree = biTree.left;
            }
            biTree = stack.pop();
            System.out.print(biTree.val + ",");
            biTree = biTree.right;
        }

        //System.out.println("");
    }

}
