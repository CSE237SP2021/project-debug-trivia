package Player;

public class Player{
    String username;
    int points;

    public Player(String username, int points){
        this.username = username;
        this.points = points;
    }

    public String getUsername(){
        return username;
    }

    public int getPoints(){
        return points;
    }
}