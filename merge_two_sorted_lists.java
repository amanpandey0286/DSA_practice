//worst time naive approach 
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
        if(list1 == null && list2 == null){
            return null;
        }
        if(list1 ==null || list2 == null){
            if(list1 != null){
                return list1;
            }else{
                return list2;
            }
        }
        ListNode newHead = null;
        ListNode plist1 = list1;
        ListNode plist2 = list2;
        while(plist1 != null && plist2 != null){
            if(plist1.val == plist2.val){
                if(newHead == null){
                    newHead  =  plist1;
                    newHead.next = plist2;
                }else{
                    newHead.next = plist1;
                    newHead.next.next = plist2;
                }
                plist1 = plist1.next;
                plist2 = plist2.next;
            }else if(plist1.val < plist2.val){
                if(newHead == null){
                    newHead  =  plist1;
                }else{
                    newHead.next = plist1;
                }
                plist1 = plist1.next;
            }else{
                if(newHead == null){
                    newHead  =  plist2;
                }else{
                    newHead.next = plist2;
                }
                plist2 = plist2.next;
            }            
        }
        return newHead;
    }
}

