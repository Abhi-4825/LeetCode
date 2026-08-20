/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null; // Tracks the previously visited node in-order

    public int getMinimumDifference(TreeNode root) {
        getMinimum(root);
        return min;
    }

    private void getMinimum(TreeNode root) {
        if (root == null) return;

        // 1. Visit Left Subtree
        getMinimum(root.left);

        // 2. Process Current Node
        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root; // Move prev pointer to current node

        // 3. Visit Right Subtree
        getMinimum(root.right);
    }
}