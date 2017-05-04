package String;

import java.util.Stack;

public class Basic_Calculator_II_227 {

	public int calculate(String s) {
        int result = 0;
        int len;
        if(s == null || (len = s.length()) == 0){
        	return result;
        }
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int number = 0;
        while(i < s.length()){
        	if(Character.isDigit(s.charAt(i))){
        		number = number*10 + s.charAt(i) - '0';
        	}
        	if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == len - 1){
        		if(sign == '+'){
        			stack.push(number);
        		}else if(sign == '-'){
        			stack.push(-number);
        		}else if(sign == '*'){
        			stack.push(stack.pop() * number);
        		}else if(sign == '/'){
        			stack.push(stack.pop() / number);
        		}
        		
        		sign = s.charAt(i);
        		number = 0;
        	}
        	i += 1;
        }
        for(Integer num : stack){
        	result += num;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Basic_Calculator_II_227().calculate("1+2-3*4/5"));
	}

}
