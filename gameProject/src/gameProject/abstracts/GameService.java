package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public interface GameService {
	
	void add(Game game);
	void remove(Game game);
	void update(Game game);
	
	void buy(Game game,Gamer gamer);
	void buy(Game game,Gamer gamer,Campaign campaign);


}
