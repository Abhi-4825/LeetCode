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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode prev=null;
       ListNode second=slow;
       while(second!=null){
        ListNode next=second.next;
        second.next=prev;
        prev=second;
        second=next;
       }
       ListNode curr=head;
       ListNode sec=prev;

       while(sec.next!=null){
        ListNode temp1 = curr.next;
            ListNode temp2 = sec.next;

            curr.next = sec;
            sec.next = temp1;

            curr = temp1;
            sec = temp2;
       }

    }
}