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
    int val=0;
    public int getDecimalValue(ListNode head) {
        getValue(head);
        return val;
    }
    private void getValue(ListNode head){
        if(head==null) return;
        val=(val<<1)| head.val;
        getValue(head.next);
    }
}