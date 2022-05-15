package gameProject;


import gameProject.abstracts.Person;
import gameProject.abstracts.PersonManager;
import gameProject.adaptors.MernisServiceAdaptor;
import gameProject.concretes.CampaignManager;
import gameProject.concretes.GameManager;
import gameProject.concretes.GamerManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class Main {

	public static void main(String[] args) throws Exception {
		Person person=new Gamer(1, "Sevtap", "Erbek", "12345678",1988,"mail@mail", "12345");
		Gamer gamer=new Gamer(1, "ali", "veli", "11111", 2018, "email", "11111");
		
		PersonManager personManager=new GamerManager(new MernisServiceAdaptor());
		
		
		//personManager.add(person);
		//personManager.add(gamer);
		
		Game game1=new Game(1, "winwin", 120);
		GameManager gameManager =new GameManager();
		gameManager.add(game1);
		
		Campaign campaign =new Campaign();
		campaign.setId(1);
		campaign.setName("Yarýsý bizden");
		campaign.setDiscount(50);
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		gameManager.buy(game1, gamer);
		gameManager.buy(game1,gamer, campaign);
		
	}

}
