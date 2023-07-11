package org.artemrogov.binary_tree;

import org.artemrogov.data_structure.TreeNode;

import java.util.*;

public class SolutionServiceImpl implements ISolutionLeetCodeBinaryTree {
    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int n = nums.length;
        int mid = n / 2;
        TreeNode root = new TreeNode(nums[mid]);
        Queue<Object[]> q = new LinkedList<>();
        q.add(new Object[]{root,
                new int[]{0, mid - 1}});
        q.add(new Object[]{root, new int[]{mid + 1, n - 1}});

        while (!q.isEmpty()) {
            Object[] curr = q.poll();
            TreeNode parent = (TreeNode) curr[0];
            int[] indices = (int[]) curr[1];
            int left = indices[0];
            int right = indices[1];
            if (left <= right && parent != null) {
                mid = (left + right) / 2;
                TreeNode child = new TreeNode(nums[mid]);
                if (nums[mid] < parent.val) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
                q.add(new Object[]{
                        child, new int[]{left, mid - 1}});
                q.add(new Object[]{
                        child, new int[]{mid + 1, right}});
            }
        }
        return root;
    }

    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    @Override
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stackNode = new Stack<>();
        while (true) {
            if (root != null) {
                stackNode.push(root);
                root = root.left;
            } else {
                if (stackNode.isEmpty()) {
                    break;
                }
                root = stackNode.peek();
                result.add(root.val);
                stackNode.pop();
                root = root.right;
            }
        }
        return result;
    }

    @Override
    public boolean isSymmetric(TreeNode root) {
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
