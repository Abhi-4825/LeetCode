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
    List<String> l=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        traverse(root,sb);
        return l;
    }
    private void traverse(TreeNode root,StringBuilder sb){
        if(root==null) return;
        int length=sb.length();
        sb.append(root.val);
        if(root.left==null && root.right==null)
        {  
           l.add(sb.toString());
        }
        else
        {
        sb.append("->");
        traverse(root.left,sb);
        traverse(root.right,sb);
        }
        
        sb.setLength(length);

    }
}