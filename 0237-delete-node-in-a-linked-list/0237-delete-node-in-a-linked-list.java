/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         /*remeber we cant delete previous node we we don't have prev adress 
          what we will do here -> just copying the next node val and deleting 
          the next so it will look like we have deleted that node */


        node.val=node.next.val;// copying the val
        node.next=node.next.next;//making connection with the next's next'
    }
}