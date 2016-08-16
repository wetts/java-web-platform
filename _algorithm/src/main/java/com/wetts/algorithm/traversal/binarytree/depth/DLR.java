package com.wetts.algorithm.traversal.binarytree.depth;

import com.wetts.algorithm.traversal.binarytree.TreeNode;

import java.util.Stack;

/**
 * 二叉树前序遍历
 *
 * @author wetts
 * @create 2016-08-05
 */
public class DLR {

    public void recursion(TreeNode biTree) {
        System.out.printf(biTree.val + "");
        TreeNode leftTree = biTree.left;
        if (leftTree != null) {
            recursion(leftTree);
        }
        TreeNode rightTree = biTree.right;
        if (rightTree != null) {
            recursion(rightTree);
        }
    }

    public void nonRecursion(TreeNode biTree) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (biTree != null || !stack.isEmpty()) {
            while (biTree != null) {
                System.out.print(biTree.val + ",");
                stack.push(biTree);
                biTree = biTree.left;
            }
            if (!stack.isEmpty()) {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }

}
