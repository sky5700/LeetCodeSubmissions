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
    public ListNode reverseList(ListNode head) {
        //corner case
        if(head == null)
        return null;
        else if(head.next == null)
        return head;

        ListNode prev = head;
        ListNode current = prev.next;

        while(current!= null)
        {
            ListNode temp = current.next;
            current.next = prev;

            prev = current; 
            current  = temp;
            
        }
        head.next = null;
        head = prev;
        
        return head;
    }
}