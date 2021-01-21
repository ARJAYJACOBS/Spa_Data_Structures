package assignment2;

import java.util.*;

public class Queue {
	
	ArrayList<Integer> myQueue;
	
	public Queue(ArrayList<Integer> myQueue) {
		this.myQueue = myQueue;
	}
	
	public void queue(int x) {
		
		this.myQueue.add(x);
	}
	
	public void dequeue(int x) {
		
		int k = this.myQueue.indexOf(x);
		
		this.myQueue.remove(k);
		
	}
	
}
