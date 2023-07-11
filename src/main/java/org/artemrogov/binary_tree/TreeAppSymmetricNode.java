package org.artemrogov.binary_tree;


import org.artemrogov.data_structure.TreeNode;

public class TreeAppSymmetricNode {
    public static void main(String[] args) {
        ISolutionLeetCodeBinaryTree solutionLeetCodeBinaryTree = new SolutionServiceImpl();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println("case 01: [1,2,2,3,4,4,3]: " + solutionLeetCodeBinaryTree.isSymmetric(root));
        TreeNode rootTestCase2 = new TreeNode(1);
        rootTestCase2.left = new TreeNode(2);
        rootTestCase2.right = new TreeNode(2);
        rootTestCase2.left.left = new TreeNode();
        rootTestCase2.left.right = new TreeNode(3);
        rootTestCase2.right.left = new TreeNode();
        rootTestCase2.right.right = new TreeNode(3);
        System.out.println("case 01: [1,2,2,null,3,null,3]: " + solutionLeetCodeBinaryTree.isSymmetric(root));
    }
}
