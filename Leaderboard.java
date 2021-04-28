import java.util.ArrayList;
import java.util.LinkedList;

public class Leaderboard {
	
	ArrayList<Integer> points = new ArrayList<Integer>();
	
	LinkedList<String> playerPoints = new LinkedList<String>();

	public void printLeaderboard(ArrayList<Player> players) {
		for (int i=0; i < players.size(); i++) {
			Player examinePlayer = players.get(i);
			points.add(examinePlayer.getPoints());
			playerPoints.add(players.get(i).getUsername());
		}
		for (int i=0; i < points.size(); i++) {
			if (points.get(i) > points.get(i+1)) {
				int pointsAmount = points.get(i);
				points.remove(i);
				points.add(pointsAmount);
				String playerName = playerPoints.get(i);
				playerPoints.remove(playerPoints.get(i));
				playerPoints.add(playerName);
			}
		}
		for (int i=0; i < points.size(); i++) {
			System.out.println(playerPoints.get(i) + ": " + points.get(i));
		}
	}

}
