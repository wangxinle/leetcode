package String;

public class Valid_Palindrome_125 {

	public boolean isPalindrome(String s) {
        
        if(s.length() <= 1){
        	return true;
        }
        String lowS = s.toLowerCase();
        char[] data = lowS.toCharArray();
        for(int i = 0, j = data.length-1;i <= j;){
        	if((data[i] >= 'a' && data[i] <= 'z') || (data[i] >= '0' && data[i] <= '9') ){
        		if((data[j] >= 'a' && data[j] <= 'z') || (data[j] >= '0' && data[j] <= '9')){
        			if(data[i] != data[j]){
        				return false;
        			}else{
        				i++;
        				j--;
        			}
        		}else{
        			j--;
        		}
        	}else{
        		i++;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Valid_Palindrome_125().isPalindrome("race a car"));
	}

}
