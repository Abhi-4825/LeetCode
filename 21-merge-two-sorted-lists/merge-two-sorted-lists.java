class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node acts as the start of the merged list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        
        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                curr.next = curr1;
                curr1 = curr1.next;
            } else {
                curr.next = curr2;
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        
        // Attach remaining nodes
        if (curr1 != null) {
            curr.next = curr1;
        } else if (curr2 != null) {
            curr.next = curr2;
        }
        
        return dummy.next;
    }
}