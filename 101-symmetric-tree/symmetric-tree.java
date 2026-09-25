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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            TreeNode[] arr=new TreeNode[s];
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                 arr[i]=curr;
                if(curr!=null){
                   
                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }
            
            int i=0;
            int j=arr.length-1;
            while(i<j){
                if(arr[i]!=null && arr[j]!=null){
                   if(arr[i].val!=arr[j].val) return false;
                }
                if((arr[i]==null && arr[j]!=null) || (arr[i]!=null && arr[j]==null) ) return false;
                i++;
                j--;
               
                
            }
       }
       return true;
    }
}