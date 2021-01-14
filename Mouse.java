package assignment1;

import java.util.*;

public class Mouse {
	 String name;
	 int xCoordinate;
	 int yCoordinate;
	 ArrayList<String> coordinateHistory = new ArrayList<String>();
	
	public Mouse(String name){
		this.name = name;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		coordinateHistory.add("( "+xCoordinate+", "+yCoordinate+")");
	}
	
	public Mouse(String name, int x, int y) {
		this.name = name;
		this.xCoordinate = x;
		this.yCoordinate = y;
		coordinateHistory.add("( "+xCoordinate+", "+yCoordinate+")");
	}
	
	public String getMouseName(){
		return this.name;
	}
	
	public int getXCoordinate() {
		return this.xCoordinate;
	}
	
	public int getYCoordinate() {
		return this.yCoordinate;
	}
	
	public void printInformation(){
		System.out.println("Name: "+name+"");
		System.out.println("Coordinates: ("+xCoordinate+", "+yCoordinate+")");
		System.out.println("Coordinate History:"+coordinateHistory);
	}
	
	public void moveUp() {
		yCoordinate += 1;
		coordinateHistory.add("( "+xCoordinate+", "+yCoordinate+")");
	}
	
	public void moveDown() {
		yCoordinate += -1;
		coordinateHistory.add("( "+xCoordinate+", "+yCoordinate+")");
	}
	
	public void moveLeft() {
		xCoordinate += -1;
		coordinateHistory.add("( "+xCoordinate+", "+yCoordinate+")");
	}
	
	public void moveRight() {
		xCoordinate += 1;
		coordinateHistory.add("( "+xCoordinate+", "+yCoordinate+")");
	}
	
	
}
