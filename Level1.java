
// this is the Level1 class, it implements "level" and creates an object for Level1 which takes in
// the questions and correct answers for the level along with the level score (increased if
// Level1.correctAnswer == userInput in main game play.
import java.util.Scanner;

public class Level1 implements Level {
	
	int levelScore;
	Question[] levelOneQuestions = new Question[6];	
	
	//create a randomizer function to print out the choices and answer randomly
	
	public String randomize(Question q){
		//there has got to be a smarter way to do this lol
		double randomNumber = Math.floor(Math.random() * 4) + 1;
		String result = "";
		if(randomNumber == 1) {
			result = "A:" + q.answer + " B:" + q.choiceTwo + " C:" + q.choiceThree + " D:" + q.choiceOne;
		}
		else if(randomNumber == 2) {
			result = "A:" + q.choiceThree + " B:" + q.answer + " C:" + q.choiceOne + " D:" + q.choiceTwo;
		}
		else if(randomNumber == 3) {
			result = "A:" + q.choiceTwo + " B:" + q.choiceOne + " C:" + q.answer + " D:" + q.choiceThree;
		}
		else if(randomNumber == 4) {
			result = "A:" + q.choiceOne + " B:" + q.choiceThree + " C:" + q.choiceTwo + " D:" + q.answer;
		}
		return result;
	}
	
	public boolean playLevel(Player p, Scanner ap){
		//don't close the Scanner because the game ends
		System.out.println("Welcome to Level 1: Bees");
		System.out.println();
		for(int i = 0; i < levelOneQuestions.length; i++) {
			Question currentQ = levelOneQuestions[i];
			System.out.println();
			System.out.println(currentQ.prompt);
			System.out.println();
			System.out.println(randomize(currentQ));
			String answer = ap.nextLine();
			System.out.println();
			if(currentQ.checkAnswer(answer)) {
				p.addPoints(levelScore);
				System.out.println("correct!");
			}
			else {
				System.out.println("Incorrect :(, the answer was " + currentQ.answer);

			}
			System.out.println(p.username + "'s score is: " + p.points);

		}
		return true;
	}
	
	{
		Question qOne = new Question( "How many grams of honey does a bee make in her lifetime?", "5", "2", "10", "4" );
		Question qTwo = new Question( "What is a bees favorite color of flower?", "Blue", "Red", "Green", "Yellow" );
		Question qThree = new Question( "How fast can a bee fly?", "15 mph", "20 mph", "8 mph", "12 mph" );
		Question qFour = new Question( "How many drones can the queen mate with in one day?", "17", "40", "8", "5" );
		Question qFive = new Question( "How many stomachs does a bee have?", "2", "0", "1", "4" );
		Question qSix = new Question( "Which of the team members stays steely in the face of these vivious creatures despite being insanely allergic?", "Sarah", "Mia", "Nina", "Sideshow Bob" );
		levelOneQuestions[0] = qOne;
		levelOneQuestions[1] = qTwo;
		levelOneQuestions[2] = qThree;
		levelOneQuestions[3] = qFour;
		levelOneQuestions[4] = qFive;
		levelOneQuestions[5] = qSix;

		this.levelScore = 10;
	}
}




