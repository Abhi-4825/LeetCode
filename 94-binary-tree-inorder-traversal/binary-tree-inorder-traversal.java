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
     List<Integer>  l=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {        
          traverse(root);
          return l;
      
    }
    private void traverse(TreeNode root){
        if(root==null) return ;
        if(root.left!=null) traverse(root.left);
        l.add(root.val);
        if(root.right!=null) traverse(root.right);
    }
}