package LinkedList;

public class Add_Two_Numbers_2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 if(l1 == null){
	        	return l2;
	        }
	        if(l2 == null){
	        	return l1;
	        }
	        int flag = 0;
	        ListNode head = new ListNode(0);
	        ListNode first = head;
	        while(l1 != null && l2 != null){
	        	int v = l1.val + l2.val + flag;
	        	ListNode temp = new ListNode(v % 10);
	        	flag = 0;
	        	first.next = temp;
	        	if(v > 9){
	        		flag = 1;
	        	}
	        	l1 = l1.next;
	        	l2 = l2.next;
	        	first = first.next;
	        }
	        while(l1 != null){
	        	int v = l1.val  + flag;
	        	ListNode temp = new ListNode(v % 10);
	        	flag = 0;
	        	first.next = temp;
	        	if(v > 9){
	        		flag = 1;
	        	}
	        	l1 = l1.next;
	        	first = first.next;
	        }
	        while(l2 != null){
	        	int v = l2.val + flag;
	        	ListNode temp = new ListNode(v % 10);
	        	flag = 0;
	        	first.next = temp;
	        	if(v > 9){
	        		flag = 1;
	        	}
	        	l2 = l2.next;
	        	first = first.next;
	        }
	        if(flag == 1){
	        	ListNode temp = new ListNode(1);
	        	first.next = temp;
	        	first = first.next;
	        }
	        return head.next;
	}
}
