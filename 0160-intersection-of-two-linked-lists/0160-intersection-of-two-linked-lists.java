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

/*
Time : o(m+n) space o(1)
Concept:
Think about the cross connection: 
Suppose here In Example 1 , a is running 4 times for headA and after poiniting   null , It is now pointing from headB  .
At thesame time b is now pointing 5 means not yet finiesed. 
After this Again both will strt iterating and intersect in 8.

If there is no intersection means at a same time after cross connection both will reach to null together. means breaking the while  loop.

Trick used: a 5 times then 3 times , b 3 times then 5 times 
           total iteration for a  = 8 , b =8. 

           
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;
    
    ListNode a = headA;
    ListNode b = headB;
    
    //if a & b have different len, then we will stop the loop after second iteration
    while( a != b){

//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null? headB : a.next;
        b = b == null? headA : b.next;    
    }
    
    return a;
}
*/