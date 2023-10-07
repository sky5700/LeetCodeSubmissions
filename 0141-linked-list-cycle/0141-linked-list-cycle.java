/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
        return false;
        else if(head.next == null)
        return false;
        else if(head.next.next == null)
        return false;

        ListNode prev = head;
        ListNode curr = prev.next;

        while(curr != null && prev != null && curr.next!= null)
        {
            if(prev == curr)
            return true;

            prev = prev.next;
            curr = curr.next.next;
           
            
        }
        return false;
        
    }
}