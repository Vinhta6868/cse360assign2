/*
 * Name: Vinh TA
 * Class: CSE 360
 * Assignment 2: Version Control System
 */


package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";   // Kept as string history to be returned in getString 
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += (" + " + value);  // update history
	}
	
	public void subtract (int value) {
		total -= value;
		history += (" - " + value);  // update history
	}
		
	public String toString () {
		return history;
	}

	public void clear() {
		history = "0";   // clear/reset history
	}
}
