class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode currentNode = head;
        int size  = 0;
        int pos = 0;
        while(currentNode != null){
            size++;
            currentNode = currentNode.next;
        }

        if((size%2) == 0){
            pos = (size/2)+1;
        }else{
            pos = (size+1)/2;
        }

        currentNode = head;
        for(int i = 1; i < pos; i++){
            currentNode  = currentNode.next;
        }

        return currentNode;
    }
}

//https://leetcode.com/problems/middle-of-the-linked-list/description/
