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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
        return list2;
        else if(list2 == null)
        return list1;
        
        ListNode temp = new ListNode();
        ListNode main = temp;
     
        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
             ListNode New = new ListNode(list1.val);   
              temp.next = New;
              list1 = list1.next;
            }
            else 
            {
              ListNode New = new ListNode(list2.val);   
              temp.next = New;
              list2 = list2.next;  
            }
           temp = temp.next;
        }
        while(list1 != null)
        {
            ListNode New = new ListNode(list1.val);   
              temp.next = New;
              list1 = list1.next;
              temp = temp.next;
        }
        while(list2 != null)
        {
             ListNode New = new ListNode(list2.val);   
              temp.next = New;
              list2 = list2.next;  
              temp = temp.next;
        }

        return main.next;
    }
}