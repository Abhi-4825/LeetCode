/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists==null || lists.length==0) return null;
      PriorityQueue<ListNode> q=new PriorityQueue<>((a,b)->a.val-b.val);
      for(ListNode l:lists) if(l!=null)q.offer(l);
      ListNode dummy=new ListNode(0);
      ListNode curr=dummy;
      while(!q.isEmpty()){
        ListNode smallest=q.poll();
        curr.next=smallest;
        curr=curr.next;
        if(smallest.next!=null) q.offer(smallest.next);
      }



      return dummy.next;

    }
}