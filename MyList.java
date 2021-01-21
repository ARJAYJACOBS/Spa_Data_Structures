package assignment2;

import java.util.Arrays;

public class MyList {
 int [] myArray;
 int [] newArray = null;
 
 public MyList(int[] myArray) {
	 this.myArray = myArray;
 }
 
 public void append(int y){ //Has a Big O value of O(n).
	 int berth = this.myArray.length;
	 
	 int[] newArray = new int [berth + 1];
	 
	 for(int i = 0; i < berth; i++) {
		 newArray[i] = this.myArray[i];
	 }
	 
	 newArray[berth - 1] = y;
 }
 
 public void pop() { //Also has a Big O value of O(n).
	 int berth = this.myArray.length;
	 
	 int[] newArray = new int [berth - 1];
	 
	 for(int i = 0; i < berth - 1; i++) {
		 
		 newArray[i] = this.myArray[i];
	 }
 }
	 
 public void insert(int x, int y){ //this method has a Big O complexity of O(n).
		 
	 int berth = this.myArray.length;
	 
	 int [] newArray = new int[berth + 1];
	 
	 for(int i = 0; i < y-1; i++) {
		 
		 newArray [i] = this.myArray [i];
	 }
	 
	 newArray[y] = x;
	 
	 for(int i = y + 1; i < newArray.length - 1; i++) {
		 newArray[i] = this.myArray[i];
	 }
	 
 }
 
 public void delete(int y) { //This method has a Big O complexity of O(n).
	  
	 int berth = this.myArray.length;
	 
	 int [] newArray = new int[berth - 1];
	 
	 for(int i = 0; i < y; i++) {
		 
		 newArray [i] = this.myArray[i];
	 }
	 for(int i = y + 1; i < newArray.length - 1; i++) {
		 
		 newArray [i] = this.myArray[i];
	 }
 }
 
 public void printList(){
	System.out.println(Arrays.toString(newArray)); 
 }

}
