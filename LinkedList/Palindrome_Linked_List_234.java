package LinkedList;

public class Palindrome_Linked_List_234 {
	
	public ListNode reverseList(ListNode head) {
	    ListNode newHead = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = next;
	    }
	    return newHead;
	}

	public boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null){
			return true;
		}
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        }
        if(fast == null){
        	slow = reverseList(slow);
        }else{
        	slow = reverseList(slow.next);
        }
        while(slow != null){
        	if(slow.val != head.val){
        		return false;
        	}
        	slow = slow.next;
        	head = head.next;
        }
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
