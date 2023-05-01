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
    public ListNode sortList(ListNode head) {
      
        if(head == null || head.next == null){
            return head;
        }
      
        ListNode currentNode = head;
        int count = 1;
//to count the length of linked list for array
        while(currentNode.next != null){
            count++;
            currentNode = currentNode.next;
        }

        int [] nodeArr = new int[count];
        ListNode currentNode2 = head;

      //assigning val of linkedlist to array
        for(int i = 0; i < count; i++){
            nodeArr[i] = currentNode2.val;
            currentNode2 = currentNode2.next;
        }

        Arrays.sort(nodeArr);
        ListNode newHead = null;
      
      //assigning sorted val to the linked list
        for(int i = 0; i < count; i++){
            if(i == 0){
                head.val = nodeArr[0];
                newHead = head;
                head = head.next;
            }else{
                head.val = nodeArr[i];
                head = head.next;
            }
            
        }
        return newHead;
    }
}


//https://leetcode.com/problems/sort-list/description/
