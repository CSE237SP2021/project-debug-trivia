import java.util.Scanner;  // Import the Scanner class

public class Play {
	
	
	// This is the PLAY class, you call this from the terminal and it takes in a username etc. 
	// This class will call the Player class to create a player object. 
	// This class will also call the level classes (which use the level interface)
			//There will be a class for each level. 
	// this will take user answers and compare them to the correct answer for that level. 

	public static void main(String[] args) {		
		//create the scanner for all the levels
		Scanner ap = new Scanner(System.in);
		
		//Creating a player class: 
		Player temp = new Player(" ", 0);
		Player singlePlayer = temp.createPlayer(ap);
		
		//declaration of levels
		Level1 levelOne = new Level1();
		Level2 levelTwo = new Level2();
		Level3 levelThree = new Level3();
		Level4 levelFour = new Level4();
		Level5 levelFive = new Level5();
		
		//playing of games
		boolean one = levelOne.playLevel(singlePlayer, ap);
		boolean two = false;
		boolean three = false;
		boolean four = false;
		if(one) {
			two = levelTwo.playLevel(singlePlayer, ap);
		}
		if(two) {
			three = levelThree.playLevel(singlePlayer, ap);

		}
		if(three) {
			four = levelFour.playLevel(singlePlayer, ap);
		}
		if(four) {
			levelFive.playLevel(singlePlayer, ap);
		}
	}
}
