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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
        ListNode dummy = new ListNode(0, head);
          ListNode nth = dummy, curr = dummy;
        
        for(int i = 0; i < n+1; i++){
            curr = curr.next;
        }
        
        while(curr!= null){
            curr = curr.next;
            nth = nth.next;
        }
      
        nth.next = nth.next.next;
        
        return dummy.next;
    }
}