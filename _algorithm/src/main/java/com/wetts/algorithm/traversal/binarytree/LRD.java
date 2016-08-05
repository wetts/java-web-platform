package com.wetts.algorithm.traversal.binarytree;

import java.util.Stack;

/**
 * 二叉树后序遍历
 *
 * @author wetts
 * @create 2016-08-05
 */
public class LRD {

    public static void recursion(TreeNode biTree) {
        TreeNode leftTree = biTree.left;
        if (leftTree != null) {
            recursion(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if (rightTree != null) {
            recursion(rightTree);
        }
        System.out.printf(biTree.val + "");
    }

    public void nonRecursion(TreeNode biTree) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (biTree != null || !stack.isEmpty()) {
            while (biTree != null) {
                stack.push(biTree);
                biTree = biTree.left;
            }
            biTree = stack.pop();
            if (biTree.right == null) {
                System.out.print(biTree.val + ",");
                biTree = stack.pop();
            } else {
                biTree = biTree.right;
            }
        }
    }

}
