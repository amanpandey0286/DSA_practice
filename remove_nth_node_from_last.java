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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode currentNode = head;
      
      //find length of the linked list
        int length = 0;
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
      
      //if we have to remove head.
        if (length == n) {
            head = head.next;
            return head;
        }

        int removeIndex = length -1 - n;
        currentNode  = head;
        for(int i = 0; i < length  ; i++){
            if(i == removeIndex){
                currentNode.next = currentNode.next.next;  //change next node to next to next.
            }else{
                currentNode = currentNode.next; //just traverse
            }
        }
        return head;
    }
}


//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
