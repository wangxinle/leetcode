package LeetCode;

import java.util.Stack;

public class MinStack {

	Stack<Integer> dataStack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	public MinStack() {		
    }
    
    public void push(int x) {
    	if(minStack.isEmpty() || minStack.peek() >= x){
    		minStack.push(x);
    	}
        dataStack.push(x);
    }
    
    public void pop() {
        if(minStack.peek().equals(dataStack.peek())){
        	minStack.pop();
        }
        dataStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(1);
		System.out.println(minStack.getMin());
	}

}
