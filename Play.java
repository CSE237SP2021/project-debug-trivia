import java.util.Scanner;  // Import the Scanner class

public class Play {
	
	
	// This is the PLAY class, you call this from the terminal and it takes in a username etc. 
	// This class will call the Player class to create a player object. 
	// This class will also call the level classes (which use the level interface)
			//There will be a class for each level. 
	// this will take user answers and compare them to the correct answer for that level. 

	public static void main(String[] args) {
		
		System.out.println("Welcome to Debug: Trivia for Bug Lovers : ) ");
		System.out.println();
		System.out.println();
		System.out.println("Please intput your username:");
		Scanner ap = new Scanner(System.in);
		String input = ap.next();
		System.out.println();
		System.out.println();		
		
		//Creating a player class: 
		Player singlePlayer = new Player(input, 0);
		System.out.println("Hello, " + singlePlayer.username);
		
	}


}
