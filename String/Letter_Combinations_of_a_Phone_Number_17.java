package String;

import java.util.LinkedList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number_17 {

	public List<String> letterCombinations(String digits) {
	    LinkedList<String> ans = new LinkedList<String>();
	    if(digits.length() == 0){
	        return ans;
	    }
	    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    ans.add("");
	    for(int i =0; i<digits.length();i++){
	        int x = Character.getNumericValue(digits.charAt(i));
	        while(ans.peek().length()==i){
	            String t = ans.remove();
	            for(char s : mapping[x].toCharArray())
	                ans.add(t+s);
	        }
	    }
	    return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new Letter_Combinations_of_a_Phone_Number_17().letterCombinations("23");
		for(String temp:data){
			System.out.println(temp);
		}
	}

}
