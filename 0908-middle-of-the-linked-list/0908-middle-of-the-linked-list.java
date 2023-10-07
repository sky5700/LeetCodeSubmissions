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
    public ListNode middleNode(ListNode head) {
        
        if(head == null)
        return null;
        else if(head.next == null)
        return head;

        int n = 0;
        ListNode temp = head;

        while(temp!=null)
        {
            temp = temp.next;
            n++;
        }
        if(n == 2)
        return head.next;
        
        int x = n/2;
        while( x > 0)
        {
            head = head.next;
            x--;
        }

        return head;
    }
}