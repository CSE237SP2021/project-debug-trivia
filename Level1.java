
// this is the Level1 class, it implements "level" and creates an object for Level1 which takes in
// the questions and correct answers for the level along with the level score (increased if
// Level1.correctAnswer == userInput in main game play.
import java.util.Scanner;

public class Level1 implements Level {
	
	int levelScore;
	Question[] levelOneQuestions = new Question[3];	

	
	//why aren't the questions lighting up properly?
	
	Question qOne = new Question( "Which Bug is a dragonfly?", "Dragonfly", "Wasp", "Dung Beetle", "Mosquito" );
	Question qTwo = new Question( "Which Bug is a mosquito?", "Mosquito", "Dragonfly", "Wasp", "Dung Beetle" );
	Question qThree = new Question( "Which Bug is a wasp?", "Wasp", "Dragonfly", "Dung Beetle", "Mosquito" );
	//create a randomizer function to print out the choices and answer randomly
	
	
	public Question[] getQuestions() {
		return levelOneQuestions;
	}
	
	public int getLevelScore() {
		return levelScore;
	}
	
	public String randomize(Question q){
		//there has got to be a smarter way to do this lol
		double randomNumber = Math.floor(Math.random() * 4) + 1;
		String result = "";
		if(randomNumber == 1) {
			result = "A." + q.answer + " B." + q.choiceTwo + " C." + q.choiceThree + " D." + q.choiceOne;
		}
		else if(randomNumber == 2) {
			result = "A." + q.choiceThree + " B." + q.answer + " C." + q.choiceOne + " D." + q.choiceTwo;
		}
		else if(randomNumber == 3) {
			result = "A." + q.choiceTwo + " B." + q.choiceOne + " C." + q.answer + " D." + q.choiceThree;
		}
		else if(randomNumber == 4) {
			result = "A." + q.choiceOne + " B." + q.choiceThree + " C." + q.choiceTwo + " D." + q.answer;
		}
		return result;
	}
	
	public void playLevel(Player p){
		//don't close the Scanner because the game ends
		Scanner apOne = new Scanner(System.in);
		for(int i = 0; i < levelOneQuestions.length; i++) {
			Question currentQ = levelOneQuestions[i];
			System.out.println();
			System.out.println(currentQ.prompt);
			System.out.println();
			System.out.println(randomize(currentQ));
			String answer = apOne.nextLine();
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
	}
	
	{
		//figure out how to put this into the Level interface
		levelOneQuestions[0] = qOne;
		levelOneQuestions[1] = qTwo;
		levelOneQuestions[2] = qThree;

		this.levelScore = 10;
	}
}




