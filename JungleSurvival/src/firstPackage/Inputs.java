package firstPackage;

import java.util.Scanner;

public class Inputs {
	public static void main(String[] args) {
		// list of string inputs
		
		String line;
		String cmd;
		
	    Scanner input = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Welcome to Jungle survival -- story inserted here");
	    System.out.println("Created by:\r\n"
	    		+ "Alberto Ortiz Aguilar\r\n"
	    		+ "Sommer Schmitz\r\n"
	    		+ "Jerod Voster");
	    System.out.println("for info on inputs type help");
	    

	    line = input.nextLine();  // Read user input
	    if(line.equalsIgnoreCase("help")) {
	    	showHelpMenu();
	    	
	    	// read the line again
	    	line = input.nextLine();
	    	
	    } else if (line.equalsIgnoreCase("move north") || (line.equalsIgnoreCase("north") || (line.equalsIgnoreCase("n")))) {
	    	// output
	    	System.out.println("moving north");
	    	// call class
	    	
	    	// read the line again
	    	line = input.nextLine();
	    } else if (line.equalsIgnoreCase("move east") || (line.equalsIgnoreCase("east") || (line.equalsIgnoreCase("e")))) {
	    	// output
	    	System.out.println("moving east");
	    	// call class
	    	
	    	// read the line again
	    	line = input.nextLine();
	    } else if (line.equalsIgnoreCase("move south") || (line.equalsIgnoreCase("south") || (line.equalsIgnoreCase("s")))) {
	    	// output
	    	System.out.println("moving south");
	    	// call class
	    	
	    	// read the line again
	    	line = input.nextLine();
	    } else if (line.equalsIgnoreCase("move west") || (line.equalsIgnoreCase("west") || (line.equalsIgnoreCase("w")))) {
	    	// output
	    	System.out.println("moving west");
	    	// call class
	    	
	    	// read the line again
	    	line = input.nextLine();
	    } else {
	    	System.out.println("command not found");
	    }
	     
	  }
	public static void showHelpMenu() {
		System.out.println("move north");
    	System.out.println("move east");
    	System.out.println("move south");
    	System.out.println("move west");
    	System.out.println("move up");
    	System.out.println("move down");
    	System.out.println("go in");
    	System.out.println("go down");
    	System.out.println("look around");
    	System.out.println("examine");
    	System.out.println("take");
    	System.out.println("inventory");
    	System.out.println("wait");
    	System.out.println("sleep");
    	System.out.println("try again");
    	System.out.println("talk");
	}
}
