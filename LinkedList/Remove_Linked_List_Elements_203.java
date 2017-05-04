package LinkedList;

public class Remove_Linked_List_Elements_203 {

	public ListNode removeElements(ListNode head, int val) {
		if(head == null){
        	return head;
        }
        ListNode start = head;
        
        while(start != null){
        	if(start.val == val){
        		start = start.next;
        	}else{
        	    break;
        	}
        }
        head = start;
        if(head == null){
        	return null;
        }
    	
    	ListNode temp = start.next;
    	while(temp != null){
    		if(temp.val == val){
    			start.next = temp.next;
    			temp = temp.next;
    		}else{
    			start = temp;
    			temp = temp.next;
    		}
    	}
    	return head;
        
    }
}
