package gameProject.concretes;

import gameProject.abstracts.CampaignService;
import gameProject.entities.Campaign;


public class CampaignManager implements CampaignService{
	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : "+campaign.getName());
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya silindi : "+campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi : "+campaign.getName());
		
	}
}
