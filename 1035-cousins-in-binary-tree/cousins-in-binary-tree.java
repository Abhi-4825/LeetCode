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
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean cousin=false;
        if( root==null) return cousin;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean xFound=false;
            boolean yFound=false;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
               
                if(curr.left!=null) { q.offer(curr.left);}
                if(curr.right!=null) {q.offer(curr.right);}

                if(curr.left!=null && curr.left.val== x ) {xFound=true;
                continue;}
                if(curr.left!=null && curr.left.val== y ) {yFound=true;
                continue;}
                 if(curr.right!=null && curr.right.val== x ) {xFound=true;
                continue;} 
                if(curr.right!=null && curr.right.val== y ) {yFound=true;
                continue;}

            }
            cousin= xFound && yFound;
            if(cousin) return cousin;
        }
        return cousin;
    }
}