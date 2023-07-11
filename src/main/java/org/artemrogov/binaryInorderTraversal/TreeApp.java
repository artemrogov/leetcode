package org.artemrogov.binaryInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode() {}

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class SolutionTree {
    public static List<Integer> inOrder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stackNode = new Stack<>();
        while (true){
            if (root!=null){
                stackNode.push(root);
                root = root.left;
            }else {
                if (stackNode.isEmpty()){
                    break;
                }
                root = stackNode.peek();
                result.add(root.value);
                stackNode.pop();
                root = root.right;
            }
        }
        return result;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
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

        List<Integer> data = SolutionTree.inOrder(root);

        System.out.println("The inOrder Traversal is : ");
        for (Integer datum : data) {
            System.out.print(datum + " ");
        }

        System.out.print("Max: " + SolutionTree.maxDepth(root));
    }
}
