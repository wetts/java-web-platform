package com.wetts.algorithm.traversal.binarytree.breath;

import com.wetts.algorithm.traversal.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树层次
 *
 * @author wetts
 * @create 2016-08-05
 */
public class LevelTraverse {

    public void levelTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        System.out.print(root.val + " ");
        stack.push(root);
        int level = 1;
        while (!stack.isEmpty()) {
            List<TreeNode> list = new ArrayList<TreeNode>();
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
            boolean tag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).left != null) {
                    System.out.print(list.get(i).left.val + " ");
                    stack.push(list.get(i).left);
                    tag = true;
                }
                if (list.get(i).right != null) {
                    System.out.print(list.get(i).right.val + " ");
                    stack.push(list.get(i).right);
                    tag = true;
                }
            }
            if (tag) {
                level++;
            }
        }
        System.out.println("二叉树共" + level + "层");
    }

}
