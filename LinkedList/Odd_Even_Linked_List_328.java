package LinkedList;

public class Odd_Even_Linked_List_328 {

	public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
        	return head;
        }
        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode secondNode = head.next;
        while(evenNode != null && evenNode.next != null){
        	oddNode.next = oddNode.next.next;
        	evenNode.next = evenNode.next.next;
        	oddNode = oddNode.next;
        	evenNode = evenNode.next;        	
        	
        }
        oddNode.next = secondNode; 
        return head;
    }
}
