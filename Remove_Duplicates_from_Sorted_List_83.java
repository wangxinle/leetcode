package LeetCode;

public class Remove_Duplicates_from_Sorted_List_83 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}else{
			ListNode new_head = head;
			while(new_head != null && new_head.next != null){
				ListNode temp = new_head.next;
				if(new_head.val == temp.val){
					ListNode new_next = temp.next;
					new_head.next = new_next;
				}else{
					new_head = new_head.next;
				}
				
			}			
		}
        return head;
    }
}
