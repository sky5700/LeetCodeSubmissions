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
 // o(n), o(n) both
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null)
        return false;
        else if(head.next == null)
        return true;


        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        //adding in stack 
        while(temp != null)
        {
            st.push(temp.val);
            temp = temp.next;
        }
         //checking from reverse order as Stack follow: LIFO
        while(head != null)
        {
            if(head.val != st.pop())
            return false;

            head = head.next;
        }
        return true;
    }
}

/* Here Space o(1)
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode firstHalfEnd = findMiddleAndReverse(head);
        ListNode secondHalfStart = firstHalfEnd.next;

        ListNode p1 = head;
        ListNode p2 = secondHalfStart;

        while (p2 != null) {
            if (p1.val != p2.val) {
                // Restore the original linked list state if needed
                firstHalfEnd.next = reverseList(secondHalfStart);
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Restore the original linked list state
        firstHalfEnd.next = reverseList(secondHalfStart);

        return true;
    }

    private ListNode findMiddleAndReverse(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;

            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        return prev;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
*/