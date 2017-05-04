package LinkedList;


public class Add_Two_Numbers_II_445 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String t1 = "";
		String t2 = "";
		while(l1 != null){
			t1 += l1.val;
			l1 = l1.next;
		}
		while(l2 != null){
			t2 += l2.val;
			l2 = l2.next;
		}
		char[] d1 = t1.toCharArray();
		char[] d2 = t2.toCharArray();
// 		System.out.println(t1);
		String result = "";
		int flag = 0;
		int i,j;
		for(i = d1.length-1, j = d2.length - 1;i >= 0 && j >=0;i--,j--){
			int v1 = d1[i] - '0';
			int v2 = d2[j] - '0';
			int v = v1 + v2 + flag;
			flag = 0;
			if(v >= 10){
				flag = 1;
			}
			result += v % 10;
// 			System.out.println(result);
		}
		while(j >= 0){
			int v2 = d2[j] - '0';
			int v = v2 + flag;
			flag = 0;
			if(v >= 10){
				flag = 1;
			}
			j--;
			result += v % 10;
		}
		while(i >= 0){
			int v1 = d1[i] - '0';
			int v = v1 + flag;
			flag = 0;
			if(v >= 10){
				flag = 1;
			}
			i--;
			result += v % 10;
		}
		if(flag == 1){
		    result += flag;    
		}
		
		char[] vv = result.toCharArray();
		ListNode head = new ListNode(vv[vv.length-1] - '0');
		ListNode second = head;
		for(int k = vv.length-2;k >= 0;k--){
			ListNode node = new ListNode(vv[k] - '0');
			second.next = node;
			second = node;
		}
		second.next = null;
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
