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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      int carry=0;
      ListNode l3=new ListNode(0);
      ListNode curr1=l1;
      ListNode curr2=l2;
      ListNode curr3=l3;
      while(curr1!=null && curr2!=null){
        int sum=curr1.val+curr2.val+carry;
        int value=sum%10;
        
        curr3.next=new ListNode(value);
         carry=sum/10;
        curr3=curr3.next;
        curr1=curr1.next;
        curr2=curr2.next;
      } 
      while(curr1!=null){
        int sum=curr1.val+carry;
        int value=sum%10;
        carry=sum/10;
        curr3.next=new ListNode(value);
        curr3=curr3.next;
        curr1=curr1.next;
      }
        while(curr2!=null){
        int sum=curr2.val+carry;
        int value=sum%10;
        carry=sum/10;
        curr3.next=new ListNode(value);
        curr3=curr3.next;
        curr2=curr2.next;
      }
      if(carry>0) curr3.next=new ListNode(carry);
      return l3.next;
    }
    
}