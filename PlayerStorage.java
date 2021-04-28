/*
 * This is the Player Storage class. It intakes new player usernames and adds them to the array list "Players."
 * 
 * Authors: Sarah Willis, Mia Collymore-Abbas, Nina Redpath.
 */
import java.util.ArrayList;

public class PlayerStorage {

	static ArrayList<Player> players = new ArrayList<Player>();
	
	public ArrayList<Player> getPlayerList(){
		return players;
	}

	public boolean addPlayer(Player newPlayer) {
		if (players.contains(newPlayer)) {
			return true;
		} else {
			players.add(newPlayer);
		}
		return true;
	}

}