package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Valid_Parentheses_20 {

	public boolean isValid(String s) {
		char[] data = s.toCharArray();
		List<String> temp = new ArrayList<>();
//		if(data.length == 0){
//			return true;
//		}
//		else if(data.length == 1){
//			return false;
//		}else{
//			if(data[0] == ')' || data[0] == ']' || data[0] == '}'){
//				return false;
//			}else{
//				
//			}
//		}
		for(int i = 0;i < data.length;i++){
			if(data[i] == '(' || data[i] == '[' || data[i] == '{'){
				temp.add(data[i]+"");
			}else{
				if(temp.size() == 0){							
					return false;
				}						
				if(data[i] == ')' && temp.get(temp.size()-1).equals("(")){
					temp.remove(temp.size()-1);
				}else if(data[i] == ']' && temp.get(temp.size()-1).equals("[")){
					temp.remove(temp.size()-1);
				}else if(data[i] == '}' && temp.get(temp.size()-1).equals("{")){
					temp.remove(temp.size()-1);
				}else{
					return false;
				}
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Valid_Parentheses_20().isValid("(("));
	}

}
