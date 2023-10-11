//bruteforce approach
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentNode1 = headA;
        ListNode currentNode2 = headB;
        ListNode res = null;
        while(currentNode1 != null){
            currentNode2 = headB;
            while(currentNode2 != null){
                if(currentNode2 == currentNode1){
                    res = currentNode2;
                    break;
                }
                currentNode2 = currentNode2.next;
            }
            if(res != null){
                break;
            }
            currentNode1 = currentNode1.next;
        }
        return res;
    }
}
//https://leetcode.com/problems/intersection-of-two-linked-lists/
