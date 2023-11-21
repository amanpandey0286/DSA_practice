int getNthFromLast(Node head, int n)
    {
    	int size = 0;
    	int ans = 0;
    	Node currNode = head;
    	while(currNode != null){
    	    size++;
    	    currNode = currNode.next;
    	}
    	if(n > size) return -1;
    	currNode  = head;
    	for(int i = 0; i < (size - n); i++){
    	    currNode = currNode.next;
    	}
    	ans = currNode.data;
    	return ans;
    }

//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?page=1&category=Arrays,Strings,Linked%20List&difficulty=Easy&sortBy=submissions
