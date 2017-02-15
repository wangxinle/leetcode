package LeetCode;

public class Merge_Two_Sorted_Lists_21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}else if(l2 == null){
			return l2;
		}else{
			ListNode new_head = null;
			if(l1.val < l2.val){
				new_head = l1;
				l1 = l1.next;
			}else{
				new_head = l2;
				l2 = l2.next;
			}
			ListNode tt = new_head;
			while(l1.next != null && l2.next != null){
				ListNode temp = null;
				if(l1.val < l2.val){
					temp = l1;
					l1 = l1.next;
				}else{
					temp = l2;
					l2 = l2.next;
				}
				tt.next = temp;
				tt = temp;				
			}
			return new_head;
		}
    }
}
