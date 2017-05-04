package String;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {
	
	public List<String> generateParenthesis(int n) {
        
		ArrayList<String> result = new ArrayList<>();
		helper(result, "", 0, 0, n);
		return result;
    }
	
	public void helper(ArrayList<String> result,String temp,int open,int close,int max){
		if(temp.length() == 2*max){
			
			result.add(temp);
			return;
		}
		if(open < max){
			
			helper(result, temp+"(", open+1, close, max);
		}
		if(close < open){
			
			helper(result, temp + ")", open, close + 1, max);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generate_Parentheses_22 g = new Generate_Parentheses_22();
		List<String> result = g.generateParenthesis(3);
		for(int i = 0;i < result.size();i++){
			System.out.println(result.get(i));
		}
	}

}
