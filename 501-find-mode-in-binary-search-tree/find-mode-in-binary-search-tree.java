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
    Map<Integer,Integer> map=new HashMap<>();
    public int[] findMode(TreeNode root) {
        traverse(root);
        int maxcount=0;
        for(int count:map.values()){
            maxcount=Math.max(maxcount,count);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() == maxcount) list.add(e.getKey());
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
    private void traverse(TreeNode root){
        if(root==null) return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        traverse(root.left);
         traverse(root.right);
    }

}