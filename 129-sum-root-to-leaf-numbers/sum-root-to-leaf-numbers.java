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
       int total=0;
    public int sumNumbers(TreeNode root) {
     
        sum(root,0);
        return total;
        
    }
    private void sum(TreeNode root, int sum){
        if(root==null) return;
        sum=sum*10+root.val;
        // check if leaf
        if(root.left==null && root.right==null){total+=sum;
        return ;} 
        sum(root.left,sum);
        sum(root.right,sum);

    }
}