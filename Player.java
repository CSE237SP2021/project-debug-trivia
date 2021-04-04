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
    
    public Player createPlayer(){
    	System.out.println("Welcome to Debug: Trivia for Bug Lovers : ) ");
    	System.out.println();
    	System.out.println("Instructions:");
		System.out.println("Type in the correct answer for each question");
		System.out.println();
		System.out.println("Please input your username:");
		Scanner ap = new Scanner(System.in);
		String input = ap.nextLine();
		System.out.println();
		System.out.println("Hello, " + input);
		System.out.println();
		Player singlePlayer = new Player(input, 0);
		return singlePlayer;
    }
}
