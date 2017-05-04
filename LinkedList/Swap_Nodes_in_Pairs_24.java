package LinkedList;

public class Swap_Nodes_in_Pairs_24 {

	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode first = head;
        ListNode firstTemp = head;
        ListNode second = head.next;
        ListNode result = second;
        while(first != null && second != null){
        	ListNode temp = second.next;
        	second.next = first;
        	first.next = temp;
        	
        	if(temp != null && temp.next != null){
        		first = temp;
            	second = temp.next;
            	firstTemp.next = second;
            	firstTemp = first;
        	}else{
        		break;
        	}
        	
        }
        return result;
        
    }
}
