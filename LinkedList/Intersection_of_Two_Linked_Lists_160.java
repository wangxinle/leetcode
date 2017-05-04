package LinkedList;

public class Intersection_of_Two_Linked_Lists_160 {

	public ListNode getIntersectionNodeNew(ListNode headA, ListNode headB) {
		if(headA == null || headB == null){
        	return null;
        }
		ListNode tempA = headA;
		ListNode tempB = headB;
		while(tempA!=tempB){
			tempA = tempA!=null?tempA.next:headB;
			tempB = tempB!=null?tempB.next:headA;
		}
		return tempA;
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
        	return null;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null ){
        	tempA = tempA.next;
        	lengthA += 1;
        }
        while(tempB != null){
        	tempB = tempB.next;
        	lengthB += 1;
        }
        int dis = 0;
        if(lengthA > lengthB){
        	dis = lengthA - lengthB;
        	while(dis > 0){
        		headA = headA.next;
        		dis--;
        	}
        	
        }else{
        	dis = lengthB - lengthA;
        	while(dis > 0){
        		headB = headB.next;
        		dis--;
        	}
        	
        }
        while(headA != null && headB != null){
    		if(headA != headB){
    			headA = headA.next;
    			headB = headB.next;
    		}else{
    			return headA;
    		}
    	}
        return null;
    }
}
