import java.util.Scanner;

//package Player;

public class Player{
	
    String username;
    int points;

    public Player(String username, int points){
        this.username = username;
        this.points = points;
    }

    public String getUsername(){
        return username;
    }

    public int getPoints(){
        return points;
    }
    
    public void addPoints(int levelPoints) {
    	this.points = levelPoints + this.points;
    }
    
    public boolean checkUsername(String username) {
    	if (!username.isEmpty() && username.trim().length()>0) {
    		return true;
    	}
    	else {
        	return false;

    	}
    }
    
    public Player createPlayer(Scanner ap){
    	System.out.println("Welcome to Debug: Trivia for Bug Lovers : ) ");
    	System.out.println();
    	System.out.println("Instructions:");
		System.out.println("Type in the corresponding letter for the answer to each question");
		System.out.println();
		System.out.println("Please input your username:");
		String input = ap.nextLine();
		while (!checkUsername(input)) {
			System.out.println("Sorry:( not a valid username");
			input = ap.nextLine();
		}
		System.out.println();
		System.out.println("Hello, " + input);
		System.out.println();
		Player singlePlayer = new Player(input, 0);
		return singlePlayer;
    }
}
