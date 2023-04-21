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

        if(head == null || head.next == null){
            return head;
        }
        ListNode prevNode = head;
        ListNode currNode = head.next;
        while(currNode != null){
            ListNode  nextNode = currNode.next;
            currNode.next = prevNode;
            
            //updating to next terms.
            prevNode = currNode;
            currNode = nextNode;
        }
        //at last when current node = null.
        head.next = null; //the first element should now turn to null.
        head = prevNode; // make the node previous to null is equal to head.

        return head;
    }
}
