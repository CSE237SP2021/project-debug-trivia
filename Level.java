
// this is the level interface, each level implements it within their class
public interface Level {
	public int getCorrectAnswer();
	public int getLevelScore();
	public String getQuestionOne();
}