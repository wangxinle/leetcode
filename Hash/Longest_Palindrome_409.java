package Hash;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome_409 {
	
	public int longestPalindrome(String s) {
        char[] ss = s.toCharArray();
        HashMap<Character, Integer> data = new HashMap<>();
        for(int i = 0;i < ss.length;i++){
        	data.put(ss[i], data.getOrDefault(ss[i], 0) + 1);
        }
        int length = 0;
        int flag = 0;
        for(Map.Entry<Character, Integer> entry: data.entrySet()){
        	if(entry.getValue() % 2 == 0){
        		length += entry.getValue();
        	}else{
        		length += entry.getValue() - 1;
        		flag = 1;
        	}	
        }
        return length + flag;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Longest_Palindrome_409().longestPalindrome("abccccdd"));
	}

}
