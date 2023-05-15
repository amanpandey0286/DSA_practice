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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstNode = head, secondNode = head;
        for(int i = 1; i< k; i++){
            firstNode = firstNode.next;
        }

        ListNode currentNode = firstNode;
        // the second node will  itrate same as length - k 
        while(currentNode.next != null){
            currentNode = currentNode.next;
            secondNode = secondNode.next;
        }

        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;

        return head;
    }
}

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
