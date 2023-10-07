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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
        return false;
        else if(head.next == null)
        return true;


        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        
        while(temp != null)
        {
            st.push(temp.val);
            temp = temp.next;
        }

        while(head != null)
        {
            if(head.val != st.pop())
            return false;

            head = head.next;
        }
        return true;
    }
}