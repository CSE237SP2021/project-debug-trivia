// we can rename this to level1.java if we want to write each level in 
// a different java class perhaps, that might be smoothest organizationally
// esp bc there will be lots of lines that are just full of questions
// we cd also randomize the order of the questions, that would be cool

// idk how to do argsprocessor in a way that's not from 131 lol
import support.cse131.ArgsProcessor;
import Player;

public class Game{
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        String username = ap.nextString("What would you like your username to be?");
        currentUser = new Player(username, 0);
    }
}