package collection;

import java.util.HashMap;

public class MapMain {
	
	public static void main(String[] args) {
		
		HashMap<Integer, FootballPlayer> myTeam = new HashMap<>();
		 
		myTeam.put(7, new FootballPlayer("손흥민", 7, "토트넘", 30));
		
		FootballPlayer footballplayer = myTeam.get(7);
		System.out.println(footballplayer);
	}

}
