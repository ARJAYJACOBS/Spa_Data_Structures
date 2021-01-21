package assignment2;

import java.util.*;

public class DumbQueue {
	
	MyStack s = new MyStack(new ArrayList<Integer>());
	
	public void queue(int x){ //Big O complexity is O(1).
		s.push(x);
	}
	
	public void dequeue(int x) { //Big O complexity is O(2n) which I think is just O(n).

		ArrayList<Integer> y = new ArrayList <Integer>();
		
		int count = 0;
		
		while(!y.contains(x)) {
			s.pop();
			count += 1;
		}
		
		y.remove(x);
		
	for(int i = count - 1; i>0; i--){
		s.push(y.get(count));
	}
}
}
