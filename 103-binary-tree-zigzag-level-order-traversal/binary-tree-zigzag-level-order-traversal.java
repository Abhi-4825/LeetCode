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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Deque <TreeNode> dq=new LinkedList<>();
        dq.offer(root);
        boolean reverse=false;
        while(!dq.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int size=dq.size();
            for(int i=0;i<size;i++){
                if(reverse){
                    TreeNode curr=dq.pollLast();
                    l.add(curr.val);
                    if(curr.right!=null)dq.addFirst(curr.right);
                    if(curr.left!=null) dq.addFirst(curr.left);
                    
                }
                 else{
                    TreeNode curr=dq.pollFirst();
                    l.add(curr.val);
                    if(curr.left!=null) dq.addLast(curr.left);
                    if(curr.right!=null)dq.addLast(curr.right);
                    
                }
             
            }
               reverse=!reverse;
                res.add(l);

        }
        return res;
    }
}