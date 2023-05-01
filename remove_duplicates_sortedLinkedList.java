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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        while(temp.next != null){
            if(temp.next.val == temp.val){
                //if the value is equal then connect next place to next to next element.
                temp.next = temp.next.next;
                continue;// it will again iterate with in while loop for next case.
            }
            temp = temp.next;
        }
        return head;
    }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
