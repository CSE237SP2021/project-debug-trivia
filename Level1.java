
public class Level1 implements Level {
	
	int correctAnswer;
	int playerAnswer;
	int levelScore;
	String questionOne;
	
	public Level1(String questionOne) {
		this.questionOne = questionOne;
	}

	public boolean isCorrect() {
		if (correctAnswer == playerAnswer) {
			return true;
		}
		return false;
	}
	
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	
	public int getPlayerAnswer() {
		return playerAnswer;
	}
	
	public int getLevelScore() {
		return levelScore;
	}
	
	public String getQuestionOne() {
		return questionOne;
	}
}
