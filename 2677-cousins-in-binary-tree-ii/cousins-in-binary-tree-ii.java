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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root==null ) return root;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        root.val=0;
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null) sum+=curr.left.val;
                 if(curr.right!=null) sum+=curr.right.val;
               q.offer(curr);
            }
             for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                int sibling=0;
                if(curr.left!=null) sibling+=curr.left.val;
                if(curr.right!=null) sibling+=curr.right.val;

                if(curr.left!=null){
                    int val=sum-sibling;
                    curr.left.val=val;
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    int val=sum-sibling;
                    curr.right.val=val;
                    q.offer(curr.right);
                }

                
            }




        }
        return root;
    }
}