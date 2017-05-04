package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;


public class MyQueue {

    Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        
        Stack<Integer> temp = new Stack<Integer>();
        int n = this.stack.size();
        for(int i = 0;i < n;i++){
            temp.push(this.stack.pop());
        }
        this.stack.push(x);
        n = temp.size();
        for(int i = 0;i < n;i++){
            this.stack.push((Integer) temp.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return (Integer)this.stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return (Integer)this.stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack.isEmpty();
    }
    
    public static void main(String[] args){
    	System.out.println((int)'z');
    	System.out.println((char)('A'^256));
    	System.out.println(3&10);
//    	ArrayList<Integer> temp = new ArrayList<>();
//    	Collections.binarySearch(temp,1);
//    	MyQueue myQueue = new MyQueue();
//    	myQueue.push(1);
//    	myQueue.push(2);
//    	myQueue.push(3);
//    	System.out.println(myQueue.pop());
//    	System.out.println(myQueue.pop());
//    	System.out.println(myQueue.pop());
//    	System.out.println(myQueue.empty());
//    	HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
    	
    			
    }
    
}
