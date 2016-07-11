import java.util.ArrayList;


/**
 * @author EricRoberts
 *
 */

public class PlayerManager {

	public ArrayList<NFLPlayer> PlayerList;
	
	public PlayerManager() {//constructor
		this.PlayerList = new ArrayList<NFLPlayer>();
		this.CreatePlayers();
	}
	private void CreatePlayers() {
		
		for (int i = 0; i < 6; i++) {
			//create player object
			NFLPlayer np = new NFLPlayer();
			
			//create player name
			String playerName = "Player " + (i + 1);
			
			//assign properties of player object
			np.setName(playerName);
			np.setNumber(i + 10);
			
			//add player to list
			this.PlayerList.add(np);
			
			//print player
			System.out.println("added " + np.getName() + " with jersey number " + np.getNumber());
		}
	}
}


