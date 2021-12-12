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
    public ListNode swapPairs(ListNode head) {    //c   t
        ListNode dummy = new ListNode(-1, head); //[0,2,1,3,4]
        ListNode curr = dummy; // 0
        // ListNode next = null;
        
        while(curr != null && curr.next != null && curr.next.next != null){
            ListNode first = curr.next; //1
            ListNode second = curr.next.next; //2
            
            ListNode temp = second.next; //3
            first.next = temp; //[1,3]
            second.next = first;
            
            curr.next = second; //[0, 2, 1, 3]
            
            
            
            curr = first;
         
        }
        
        return dummy.next;
    }
}