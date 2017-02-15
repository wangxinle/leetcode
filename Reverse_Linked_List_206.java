package LeetCode;

public class Reverse_Linked_List_206 {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		ListNode temp = head;
		while(temp.next != null){
			ListNode n1 = temp.next;
			temp.next = n1.next;
			n1.next = head;
			head = n1;
		}
        return head;
    }
}
