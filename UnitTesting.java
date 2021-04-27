/*
 * This is the unit testing file.  it contains unit tests for the entire project.
 * 
 * Authors:  Mia Collymore Abbas, Nina Redpath, Sarah Willis
 */

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

	//checking for valid and invalid new user names
	@Test
	void testNewUser() {
		//check if "Username" is a valid user name.
		boolean isValidUsername = testPlayer.checkUsername("username");
		assertTrue(isValidUsername);
	}

	@Test
	void testBadNewUser() {
		boolean isValidUsername = testPlayer.checkUsername("");
		assertFalse(isValidUsername);
	}

	@Test
	void testAnotherBadNewUser() {
		boolean isValidUsername = testPlayer.checkUsername("    ");
		assertFalse(isValidUsername);
	}

	
	// create player test
	@Test
	void createPlayer() {
		String username = "test-username";
		int points =0;
		Player newPlayer = new Player(username, points);
		
		assertTrue(username == newPlayer.username && points == newPlayer.points);
	}


	//test valid and invalid input
	@Test
	void testGoodInput() {
		boolean isValidInput = testQuestion.checkValidInput("A");
		assertTrue(isValidInput);
	}
	
	@Test
	void testBadInput() {
		boolean isValidInput = testQuestion.checkValidInput("Here's my answer");
		assertFalse(isValidInput);		
	}
	
	@Test
	void testAnotherBadInput() {
		boolean isValidInput = testQuestion.checkValidInput("  ");
		assertFalse(isValidInput);		
	}

	//create question test
	@Test 
	void testCreateQuestion() {
		String question = "Question";
		String one = "option1";
		String two = "option2";
		String three = "option3";
		String ans = "answer";
		
		Question testQuestion = new Question(question, ans, one, two, three);
		
		boolean checkAns = (ans == testQuestion.answer);
		boolean checkQuestion = (question == testQuestion.prompt);
		
		assertTrue(checkAns && checkQuestion);
	}

	//randomize test -- THIS ONE NEEDS FIXIN
	@Test 
	void randomizeTest() {
		Level1 one = new Level1();
		one.randomize(testQuestion);
		assertTrue(true);
	}

	//add points test
	@Test 
	void addPoints() {
		int initialPoints = testPlayer.getPoints();
		int addNum = 5;
		testPlayer.addPoints(addNum);
		initialPoints += addNum;
		assertEquals(testPlayer.getPoints(), initialPoints);
	}


//	@Test
//	void testNewLevel() {
//		Level1 one = new Level1();
//		one.playLevel(testPlayer, testScanner);
//		assertTrue(true);
//
//	}
//
//	@Test
//	void testLevel2() {
//		Level2 level = new Level2();
//		level.playLevel(testPlayer, testScanner);
//		assertTrue(true);
//
//	}
//
//	@Test
//	void testLevel3() {
//		Level3 level = new Level3();
//		level.playLevel(testPlayer, testScanner);
//		assertTrue(true);
//
//	}
//
//	@Test
//	void testLevel4() {
//		Level4 level = new Level4();
//		level.playLevel(testPlayer, testScanner);
//		assertTrue(true);
//
//	}
//
//	@Test
//	void testLevel5() {
//		Level5 level = new Level5();
//		level.playLevel(testPlayer, testScanner);
//		assertTrue(true);
//	}

}

