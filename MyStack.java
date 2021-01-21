package assignment2;

import java.util.*;

public class MyStack {
	ArrayList<Integer> myStack;
	
	public MyStack(ArrayList<Integer> myStack) {
		this.myStack = myStack;
	}
	
	public void push(int k) {
		this.myStack.add(k);
	}
	
	public int pop() {
		int last = this.myStack.get(this.myStack.size()-1);
		
		this.myStack.remove(this.myStack.size()-1);
		
		return last;
	}
	
}
