package org.artemrogov.binary_tree;

import org.artemrogov.data_structure.TreeNode;

public class TreeAppSortedBST {
    public static void main(String[] args) {
        ISolutionLeetCodeBinaryTree solution = new SolutionServiceImpl();
        int[] rArr = new int[]{-10,-3,0,5,9};

        TreeNode treeNodeResultTestCase01 = solution.sortedArrayToBST(rArr);
        SolutionUtil.getDataTree(treeNodeResultTestCase01);

        int[] rArr2 = new int[]{1,3};
        System.out.println("----");
        TreeNode treeNodeResultTestCase02 = solution.sortedArrayToBST(rArr2);
        SolutionUtil.getDataTree(treeNodeResultTestCase02);

    }
}
