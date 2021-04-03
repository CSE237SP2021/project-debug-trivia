//an individual question for the trivia game
public class Question {
	String prompt;
	String answer;
	String choiceOne;
	String choiceTwo;
	String choiceThree;
	
	public Question(String prompt, String answer, String choiceOne, String choiceTwo, String choiceThree) {
		this.prompt = prompt;
		this.answer = answer;
		this.choiceOne = choiceOne;
		this.choiceTwo = choiceTwo;
		this.choiceThree = choiceThree;
	}
	
	public String getPrompt() {
		return prompt;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public boolean checkAnswer(String input) {
		if(input.equals(answer)) {
			return true;
		}
		else {
			return false;
		}
	}
}

