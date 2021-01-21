package assignment2;

public class Main {
	
	public static void main(String [] args) {
		
		MyList m = new MyList(new int [5]);
		
		m.append(3);
		m.pop();
		m.append(7);
		m.append(8);
		m.insert(3,1);
		m.delete(1);
		m.printList();
		
	}
}
