package org.artemrogov.binary_tree;

import org.artemrogov.data_structure.TreeNode;
import java.util.List;

public class TreeApp {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);

        ISolutionLeetCodeBinaryTree solutionOrder = new SolutionServiceImpl();
        List<Integer> data = solutionOrder.inOrder(root);

        System.out.println("The inOrder Traversal is : ");
        for (Integer datum : data) {
            System.out.print(datum + " ");
        }

        System.out.print("Max: " + solutionOrder.maxDepth(root));
    }
}
