package com.example.codingtest.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Count_Good_Nodes_in_Binary_Tree_Test {

    @Test
    void goodNodes_1() {
        Count_Good_Nodes_in_Binary_Tree service = new Count_Good_Nodes_in_Binary_Tree();
        Count_Good_Nodes_in_Binary_Tree.TreeNode left_three = new Count_Good_Nodes_in_Binary_Tree.TreeNode(3, null, null);
        Count_Good_Nodes_in_Binary_Tree.TreeNode left_one = new Count_Good_Nodes_in_Binary_Tree.TreeNode(1, left_three, null);
        Count_Good_Nodes_in_Binary_Tree.TreeNode right_one = new Count_Good_Nodes_in_Binary_Tree.TreeNode(1, null, null);
        Count_Good_Nodes_in_Binary_Tree.TreeNode right_five = new Count_Good_Nodes_in_Binary_Tree.TreeNode(5, null, null);
        Count_Good_Nodes_in_Binary_Tree.TreeNode right_four = new Count_Good_Nodes_in_Binary_Tree.TreeNode(4, right_one, right_five);
        Count_Good_Nodes_in_Binary_Tree.TreeNode root = new Count_Good_Nodes_in_Binary_Tree.TreeNode(3, left_one, right_four);
        int result = service.goodNodes(root);
        Assertions.assertEquals(4, result);
    }

    @Test
    void goodNodes_2() {
        Count_Good_Nodes_in_Binary_Tree service = new Count_Good_Nodes_in_Binary_Tree();
        Count_Good_Nodes_in_Binary_Tree.TreeNode left_four = new Count_Good_Nodes_in_Binary_Tree.TreeNode(4, null, null);
        Count_Good_Nodes_in_Binary_Tree.TreeNode right_two = new Count_Good_Nodes_in_Binary_Tree.TreeNode(2, null, null);
        Count_Good_Nodes_in_Binary_Tree.TreeNode left_three = new Count_Good_Nodes_in_Binary_Tree.TreeNode(3, left_four, right_two);;
        Count_Good_Nodes_in_Binary_Tree.TreeNode root = new Count_Good_Nodes_in_Binary_Tree.TreeNode(3, left_three, null);
        int result = service.goodNodes(root);
        Assertions.assertEquals(3, result);
    }
}