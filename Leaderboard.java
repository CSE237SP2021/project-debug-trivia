import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Leaderboard {
	
	ArrayList<Integer> points = new ArrayList<Integer>();
	
	LinkedList<String> playerPoints = new LinkedList<String>();

	public ArrayList<Integer> printLeaderboard(ArrayList<Player> players) {
		for (int i=0; i < players.size(); i++) {
			Player examinePlayer = players.get(i);
			points.add(examinePlayer.getPoints());
		}
		Collections.sort(points);
		return points;
	}
	
	// really confused about this
	public boolean printLeaderboardDemo(ArrayList<Player> players) {
		sortPlayerPoints(PlayerStorage.getPlayerList());
		for (int i=0; i < playerPoints.size(); i++)
		System.out.println()
		
	}
}
