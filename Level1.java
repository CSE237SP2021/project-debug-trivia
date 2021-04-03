
// this is the Level1 class, it implements "level" and creates an object for Level1 which takes in
// the questions and correct answers for the level along with the level score (increased if
// Level1.correctAnswer == userInput in main game play.
public class Level1 implements Level {
	
	int levelScore;
	Question[] levelOneQuestions = new Question[3];	

	
	//why aren't the questions lighting up properly?
	
	Question qOne = new Question( "Which Bug is a dragonfly?", "Dragonfly", "Wasp", "Dung Beetle", "Mosquito" );
	Question qTwo = new Question( "Which Bug is a mosquito?", "Mosquito", "Dragonfly", "Wasp", "Dung Beetle" );
	Question qThree = new Question( "Which Bug is a wasp?", "Wasp", "Dragonfly", "Dung Beetle", "Mosquito" );
	//create a randomizer function to print out the choices and answer randomly
	levelOneQuestions[0] = qOne;
	levelOneQuestions[1] = qTwo;
	levelOneQuestions[2] = qThree;
 	
	String question1 = "Which Bug is a dragon fly? \n A. Mosquito   B. Dragon Fly  C. Wasp  D. Dung Beetle";
	String answer1 = "B";
	
	String question2 = "Which Bug is a mosquito? \n A. Mosquito   B. Dragon Fly  C. Wasp  D. Dung Beetle";
	String answer2 = "B";

	String question3 = "Which Bug is wasp? \n A. Mosquito   B. Dragon Fly  C. Wasp  D. Dung Beetle";
	String answer3 = "C";
		
	
	public String getAnswer(int index) {
		return levelOneAnswers[index];
	}
	
	public String getQuestion(int index) {
		return levelOneQuestions[index];
	}
	
	public int getLevelScore() {
		return levelScore;
	}
	
	{
		this.levelOneQuestions[0] = question1;
		this.levelOneAnswers[0] = answer1;
		this.levelOneQuestions[1] = question2;
		this.levelOneAnswers[1] = answer2;
		this.levelOneQuestions[2] = question3;
		this.levelOneAnswers[2] = answer3;
		

		this.levelScore = 10;
	}
}




