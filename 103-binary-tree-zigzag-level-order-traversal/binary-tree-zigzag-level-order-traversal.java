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
        List<List<Integer>> zigzag=new ArrayList<>();
        if(root== null ) return zigzag;
        Deque<TreeNode> dq=new LinkedList<>();
        dq.offer(root);
        boolean reverse=false;
        while(!dq.isEmpty()){
            int size=dq.size();
            List<Integer> current=new ArrayList<>(size);
            for(int i=0;i<size;i++){
            if(!reverse){
             TreeNode currentNode=dq.pollFirst();
             current.add(currentNode.val);
             if(currentNode.left!=null) dq.offerLast(currentNode.left);
            if(currentNode.right!=null) dq.offerLast(currentNode.right);
          }else{
             TreeNode currentNode=dq.pollLast();
             current.add(currentNode.val);
             if(currentNode.right!=null) dq.offerFirst(currentNode.right);
             if(currentNode.left!=null) dq.offerFirst(currentNode.left);
            
          }
        

            }
            reverse=!reverse;
           zigzag.add(current);


        }

  return zigzag;
    }
}