# Debug: Trivia for Insect Lovers

Mia Collymore Abbas, Nina Redpath, and Sarah Willis

This project is a multiple-choice trivia game centered around bugs that increases with difficulty with each new level and corresponding new bug!

<h2>For the first iteration, we did the following: </h2>

- set up our repo and kanban board <br />
- mapped out the general structure of our code (in terms of classes, interfaces etc) <br />
- created a level one class and player class that hold information  <br />
- created the basic play loop so that one level can be played ** note that the trivia is placeholder questions, not real trivia yet. <br />
- created a score system that updates when a question is correct. <br />

<h2> For the second iteration, we: </h2><br />
- added the rest of the levels <br />
- inputed real trivia <br />
- made the instructions more user-friendly. <br />
- made the level increment when the current level is finished <br />
- added unit testing <br />
  
  
<h2>for the FINAL iteration, we did the following: </h2> <br />
- made the unit tests more effective and more exhaustive <br />
- added regex so that the user would be prompted again if their response was not valid (not in the form: A, B, C or D) <br />
- added regex so that for the username and the question responses, an empty string would not be accepted <br />
- added the capability of recognizing upper and lower case correct responses.  <br />
- added ASCII code images for each level <br />
- added a leaderboard class to store local scores and implemented this to print after the levels. <br />

For this iteration, the one thing that is not working entirely as planned is the leaderboard class. 
Our initial thought was to make this a multiplayer game, but as other technical issues/"bugs" in the code came up, we did not have time to implement this. 
therefore, while our leaderclass prints out the current "winner" for a single player, and is a start for code that could handle multiple players, we were not able to test that functionality. 
	
<h2>Usage: </h2>
	please download the repository and navigate to it in your terminal 
	
	run Javac Play.java
	run java Play. 
	have fun!! 
	
** Note that the responses to the trivia questions should be the corresponding letter of the answer (upper or lower case)
