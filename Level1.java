
// this is the Level1 class, it implements "level" and creates an object for Level1 which takes in
// the questions and correct answers for the level along with the level score (increased if
// Level1.correctAnswer == userInput in main game play.
public class Level1 implements Level {
	
	String correctAnswer;
	int levelScore;
	String [] levelOneQuestions = new String[3];
	String [] levelOneAnswers = new String[3];
	

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




