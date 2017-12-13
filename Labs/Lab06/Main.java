package ca.ciccc.java.driver;

import ca.ciccc.java.helper.InputReader;
import ca.ciccc.java.view.InputOutput;

public class Main {

	public static void main(String[] args) {
		
		InputReader ir = new InputReader();
		InputOutput io = new InputOutput();
		
		String input;
		
		do {
			
			System.out.print("Type a date (yyyy-mm-dd) or \"quit\" to exit: ");
			input = ir.getStringInput();
			
			System.out.println(input);
			
		}
		while(input.compareToIgnoreCase("quit") != 0);
		
	}

}
