

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTesting {
	
	private Player testPlayer;
	private Question testQuestion;
	private Scanner testScanner;
	
	@BeforeEach
	void setUpTestingVariables() {
		testPlayer = new Player("testusername", 0);
		testQuestion = new Question("Question", "Answer", "option one", "option 2", "option 3");
		testScanner = new Scanner(System.in);


	}

	//adding a new username
	@Test
	void testNewUser() {
		//setup 
		//run behavior
		//check result
		assertTrue(testPlayer.checkUsername("username"));
		
	}
	
	// create player 
	@Test
	void createPlayer() {
		testPlayer.createPlayer(testScanner);
		assertTrue(true);
	}

	//adding a blank username
	@Test
	void testBadNewUser() {
		assertFalse(testPlayer.checkUsername(""));
	}

	@Test
	void testInput() {
		assertFalse(testQuestion.checkValidInput("testanswer"));
		
	}
	//testing bad input 
	@Test
	void testBadInput() {
		assertFalse(testQuestion.checkValidInput("blah blah"));
	}
	
	//test correct answer
	@Test
	void testCorrectAnswer() {
		assertTrue(testQuestion.checkAnswer("Answer"));
	}
	
	//test incorrect asnwer
	@Test
	void testIncorrectAnswer() {
		assertFalse(testQuestion.checkAnswer("option one"));
	}

	
	//randomize test? 
	@Test 
	void randomizeTest() {
		Level1 one = new Level1();
		one.randomize(testQuestion);
		assertTrue(true);
	}
	
	//add points test
	@Test 
	void addPoints() {
		testPlayer.addPoints(5);
		assertTrue(true);
	}
	
	
	
	@Test
	void testNewLevel() {
		Level1 one = new Level1();
		one.playLevel(testPlayer, testScanner);
		assertTrue(true);
		
	}
	
	@Test
	void testLevel2() {
		Level2 level = new Level2();
		level.playLevel(testPlayer, testScanner);
		assertTrue(true);
		
	}
	
	@Test
	void testLevel3() {
		Level3 level = new Level3();
		level.playLevel(testPlayer, testScanner);
		assertTrue(true);
		
	}
	
	@Test
	void testLevel4() {
		Level4 level = new Level4();
		level.playLevel(testPlayer, testScanner);
		assertTrue(true);
		
	}
	@Test
	void testLevel5() {
		Level5 level = new Level5();
		level.playLevel(testPlayer, testScanner);
		assertTrue(true);
	}

}



