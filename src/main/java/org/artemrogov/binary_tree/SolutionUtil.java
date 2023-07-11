package org.artemrogov.binary_tree;

import org.artemrogov.data_structure.TreeNode;

public class SolutionUtil {
    public static void getDataTree(TreeNode node){
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        getDataTree(node.left);
        getDataTree(node.right);
    }
}
