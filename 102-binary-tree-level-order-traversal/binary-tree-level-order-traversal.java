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
    public List<List<Integer>> levelOrder(TreeNode root) {
       
        List<List<Integer>> global=new ArrayList<>();
        if(root == null ) return global;
         Queue<TreeNode> q=new LinkedList<>();
         q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> currentLevel=new ArrayList<>(size);
            for(int i=0;i<size;i++){
               TreeNode currentNode=q.poll();
               currentLevel.add(currentNode.val);
               if(currentNode.left!=null) q.offer(currentNode.left);
               if(currentNode.right!=null) q.offer(currentNode.right);
            }
            global.add(currentLevel);

        }
     return global;

        
    }
}