
// this is the level interface, each level implements it within their class
public interface Level {
	public String getAnswer(int index);
	public int getLevelScore();
	public String getQuestion(int index);
}