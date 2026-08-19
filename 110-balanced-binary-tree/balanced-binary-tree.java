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
    public boolean isBalanced(TreeNode root) {
        
        return getBalancingFactor(root);
        
    }
       private boolean getBalancingFactor(TreeNode node){
        if(node==null)return true;
        int bf= getHeight(node.left)-getHeight(node.right);
        if(bf>1 || bf<-1) return false;
       return  getBalancingFactor(node.left) &&  getBalancingFactor(node.right);

    }
    private int getHeight(TreeNode node){
        if(node==null) return -1;
        int left=getHeight(node.left);
        int right=getHeight(node.right);
        return Math.max(left,right)+1;
    }
}