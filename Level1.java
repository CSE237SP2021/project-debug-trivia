
// this is the Level1 class, it implements "level" and creates an object for Level1 which takes in
// the questions and correct answers for the level along with the level score (increased if
// Level1.correctAnswer == userInput in main game play.
public class Level1 implements Level {
	
	String correctAnswer;
	int levelScore;
	String questionOne;
	
	public Level1(String questionOne, String correctAnswer) {
		this.questionOne = questionOne;
		this.correctAnswer = correctAnswer;
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public int getLevelScore() {
		return levelScore;
	}
	
	public String getQuestionOne() {
		return questionOne;
	}
}


