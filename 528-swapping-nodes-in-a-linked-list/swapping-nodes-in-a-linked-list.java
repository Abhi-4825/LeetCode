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
    public ListNode swapNodes(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        ListNode front=head;
        for(int i=1;i<k;i++){
            front=front.next;
        }
        ListNode last=head;
        for(int i=0;i<size-k;i++){
          last=last.next;
        }
       
        int val=last.val;
        last.val=front.val;
        front.val=val;

        return head;

    }
}