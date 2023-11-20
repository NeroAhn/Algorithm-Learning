package com.example.codingtest.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree
 */
public class Count_Good_Nodes_in_Binary_Tree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    /*
        DFS 탐색을 하면서 탐색해 왔던 노드의 max 값을 함께 넘긴다.
        하위 노드에서는 전달받은 max 값보다 현재 value 가 같거나 클 경우 good 카운트를 늘린다.
     */
    int goodCount = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, 0);
        return goodCount;
    }

    private void dfs(TreeNode curNode, int max) {
        if (curNode == null) return;
        if (max <= curNode.val) {
            goodCount++;
        }
        max = Math.max(max, curNode.val);
        dfs(curNode.left, max);
        dfs(curNode.right, max);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
