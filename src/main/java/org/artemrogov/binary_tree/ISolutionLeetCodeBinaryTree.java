package org.artemrogov.binary_tree;

import org.artemrogov.data_structure.TreeNode;

import java.util.List;

public interface ISolutionLeetCodeBinaryTree {
    TreeNode sortedArrayToBST(int[] nums);
    int maxDepth(TreeNode root);
    List<Integer> inOrder(TreeNode root);

    boolean isSymmetric(TreeNode root);
}
