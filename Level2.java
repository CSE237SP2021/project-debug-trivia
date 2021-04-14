import java.util.Scanner;

public class Level2 implements Level{
	
	int levelScore;
	Question[] levelTwoQuestions = new Question[6];	
	String answerLetter;
	
	//create a randomizer function to print out the choices and answer randomly
	
	public String randomize(Question q){
		double randomNumber = Math.floor(Math.random() * 4) + 1;
		String result = "";
		if(randomNumber == 1) {
			result = "A: " + q.answer + " B: " + q.choiceTwo + " C: " + q.choiceThree + " D: " + q.choiceOne;
			answerLetter = "A";
		}
		else if(randomNumber == 2) {
			result = "A: " + q.choiceThree + " B: " + q.answer + " C: " + q.choiceOne + " D: " + q.choiceTwo;
			answerLetter = "B";
		}
		else if(randomNumber == 3) {
			result = "A: " + q.choiceTwo + " B: " + q.choiceOne + " C: " + q.answer + " D: " + q.choiceThree;
			answerLetter = "C";
		}
		else if(randomNumber == 4) {
			result = "A: " + q.choiceOne + " B: " + q.choiceThree + " C: " + q.choiceTwo + " D: " + q.answer;
			answerLetter = "D";
		}
		return result;
	}
	
	public boolean playLevel(Player p, Scanner ap){
		//don't close the Scanner because the game ends
		System.out.println("Welcome to Level 2: Caterpillars");
		System.out.println();
		for(int i = 0; i < levelTwoQuestions.length; i++) {
			Question currentQ = levelTwoQuestions[i];
			System.out.println();
			System.out.println(currentQ.prompt);
			System.out.println();
			System.out.println(randomize(currentQ));
			String answer = ap.nextLine();
			System.out.println();
			if(answer.equals(answerLetter)) {
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
		Question qOne = new Question( "What do caterpillars produce?", "Silk", "Aloe", "Sap", "Honey" );
		Question qTwo = new Question( "How many true legs does a caterpilllar have?", "6", "12", "4", "22" );
		Question qThree = new Question( "Up to how many muscles can a caterpillar have?", "4,000", "2,225", "62", "500" );
		Question qFour = new Question( "What preys on caterpillars?", "All of the above", "Wasps", "Parasites", "Birds" );
		Question qFive = new Question( "How many eyes do caterpillars have?", "12", "30", "2", "8" );
		Question qSix = new Question( "What is the monarch caterpillar's host plant?", "Milkweed", "Dandelions", "Sunflowers", "Cabbage" );
		levelTwoQuestions[0] = qOne;
		levelTwoQuestions[1] = qTwo;
		levelTwoQuestions[2] = qThree;
		levelTwoQuestions[3] = qFour;
		levelTwoQuestions[4] = qFive;
		levelTwoQuestions[5] = qSix;

		this.levelScore = 20;
	}
}
