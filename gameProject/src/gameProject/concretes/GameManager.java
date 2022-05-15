package gameProject.concretes;

import gameProject.abstracts.GameService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : "+game.getName());
		
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun silindi : "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun g�ncellendi : "+game.getName());
		
	}

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() +" oyunu sat�n ald�: "+game.getName()+" �creti: "+game.getUnitPrice());
		
	}

	@Override
	public void buy(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() +" oyunu sat�n ald�: "+game.getName()+". Kullan�lan kampanya:  "+ campaign.getName()+". �creti: "+
	(game.getUnitPrice()-game.getUnitPrice()*campaign.getDiscount()/100));

		
	}

}
