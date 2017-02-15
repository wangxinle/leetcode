package LeetCode;

public class Palindrome_Number_9 {

	public boolean isPalindrome(int x) {
		if(x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE){
			return false;
		}
		if(Math.abs(x) < 10){
			return true;
		}
		
		x = Math.abs(x);
		int result = x;
		int length = (int)Math.log10(x)+1;
		int i = 0;		
		if(length % 2 == 0){
			int temp = 0;
			while(i < length/2){
				int number = x%10;
				temp += number*Math.pow(10, length-i-1) + number*Math.pow(10, i);
				i++;
				x = x/10;
			}
			if(temp == result){				
				return true;
			}else{
				return false;
			}
		}else{
			int temp = 0;
			while(i < length/2){
				int number = x%10;
				temp += number*Math.pow(10, length-i-1) + number*Math.pow(10, i);
				i++;
				x = x/10;
			}
			temp += (x%10)*Math.pow(10, i);
			if(temp == result){
				return true;
			}else{
				return false;
			}
		}        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
		System.out.println(new Palindrome_Number_9().isPalindrome(-2147483648));
	}

}
