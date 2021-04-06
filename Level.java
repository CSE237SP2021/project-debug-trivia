
// this is the level interface, each level implements it within their class
import java.util.Scanner;

public interface Level {
	public String randomize(Question q);
	public boolean playLevel(Player p, Scanner ap);
}