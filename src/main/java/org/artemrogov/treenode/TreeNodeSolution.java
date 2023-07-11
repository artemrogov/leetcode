package org.artemrogov.treenode;


import java.util.Stack;

class TreeNode {
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

class Solution {
    public static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.empty()) {

            TreeNode root1 = stack.pop();
            TreeNode root2 = stack.pop();

            if (root1 == null && root2 == null) {
                continue;
            }

            if (root1 == null || root2 == null) {
                return false;
            }

            if (root1.val != root2.val) {
                return false;
            }


            stack.push(root1.left);
            stack.push(root2.right);
            stack.push(root1.right);
            stack.push(root2.left);
        }

        return true;
    }
}

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class TreeNodeSolution {

    public static void main(String[] args) {
        showTestCase01();
        showTestCase02();
    }

    public static void showTestCase01(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println("case 01: [1,2,2,3,4,4,3]: " + Solution.isSymmetric(root));
    }


    public static void showTestCase02(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode();
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode();
        root.right.right = new TreeNode(3);
        System.out.println("case 01: [1,2,2,null,3,null,3]: " + Solution.isSymmetric(root));
    }
}
