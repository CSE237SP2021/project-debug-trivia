import java.util.ArrayList;
import java.util.Collections;

public class Leaderboard {
	
	ArrayList<Integer> points = new ArrayList<Integer>();

	public ArrayList<Integer> sortPlayerPoints(ArrayList<Player> players) {
		for (int i=0; i < players.size(); i++) {
			Player examinePlayer = players.get(i);
			points.add(examinePlayer.getPoints());
		}
		Collections.sort(points);
		return points;
	}
}
