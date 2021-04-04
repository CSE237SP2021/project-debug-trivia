
// this is the level interface, each level implements it within their class
import java.util.Scanner;

public interface Level {
	public Question[] getQuestions();
	public int getLevelScore();
	public static String randomize(Question q) {
		double randomNumber = Math.floor(Math.random() * 4) + 1;
		String result = "";
		if(randomNumber == 1) {
			result = "A." + q.answer + " B." + q.choiceThree + " C." + q.choiceTwo + " D." + q.choiceOne;
		}
		else if(randomNumber == 2) {
			result = "A." + q.choiceThree + " B." + q.answer + " C." + q.choiceTwo + " D." + q.choiceOne;
		}
		else if(randomNumber == 3) {
			result = "A." + q.choiceTwo + " B." + q.choiceThree + " C." + q.answer + " D." + q.choiceOne;
		}
		else if(randomNumber == 4) {
			result = "A." + q.choiceOne + " B." + q.choiceThree + " C." + q.choiceTwo + " D." + q.answer;
		}
		return result;
	};
	public void playLevel(Player p);
}