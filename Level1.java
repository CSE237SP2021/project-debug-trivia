
// this is the Level1 class, it implements "level" and creates an object for Level1 which takes in
// the questions and correct answers for the level along with the level score (increased if
// Level1.correctAnswer == userInput in main game play.
public class Level1 implements Level {
	
	String correctAnswer;
	int levelScore;
	String [] levelOneQuestions = new String[3];
	String [] levelOneAnswers = new String[3];
	
	
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
		for(int i = 0; i < 3; i++) {
			String s = Integer.toString(i);
			this.levelOneQuestions[i] = "Please enter " + s;
			this.levelOneAnswers[i] = s;
		}
		this.levelScore = 10;
	}
}




