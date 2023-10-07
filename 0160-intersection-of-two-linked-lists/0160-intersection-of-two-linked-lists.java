/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //In my code Time : o(m+n) and space o(m)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        List<ListNode> list = new ArrayList<>();
        while(headA != null)
        {
            list.add(headA);
            headA = headA.next;
        }

        while(headB != null )
        {
            if(list.contains(headB))
            return headB;

            headB = headB.next;
        }

        return null;
        
    }
}