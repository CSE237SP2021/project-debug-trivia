import java.util.Scanner;

public class Level2 implements Level{
	
	int levelScore;
	Question[] levelTwoQuestions = new Question[3];	

	
	//why aren't the questions lighting up properly?
	
	Question qOne = new Question( "Which Bug is a dragonfly?", "Dragonfly", "Wasp", "Dung Beetle", "Mosquito" );
	Question qTwo = new Question( "Which Bug is a mosquito?", "Mosquito", "Dragonfly", "Wasp", "Dung Beetle" );
	Question qThree = new Question( "Which Bug is a wasp?", "Wasp", "Dragonfly", "Dung Beetle", "Mosquito" );
	//create a randomizer function to print out the choices and answer randomly
	
	
	public Question[] getQuestions() {
		return levelTwoQuestions;
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
	
	public void playLevel(Player p, Scanner ap){
		System.out.println("Welcome to Level 2");
		System.out.println();
		//don't close the Scanner because the game ends
		for(int i = 0; i < levelTwoQuestions.length; i++) {
			Question currentQ = levelTwoQuestions[i];
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
	}
	
	{
		//figure out how to put this into the Level interface
		levelTwoQuestions[0] = qOne;
		levelTwoQuestions[1] = qTwo;
		levelTwoQuestions[2] = qThree;

		this.levelScore = 20;
	}
}
