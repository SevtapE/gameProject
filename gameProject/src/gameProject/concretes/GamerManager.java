package gameProject.concretes;

import gameProject.abstracts.GamerService;
import gameProject.abstracts.Person;
import gameProject.abstracts.PersonCheckService;
import gameProject.abstracts.PersonManager;

public class GamerManager extends PersonManager implements GamerService {

	private PersonCheckService personCheckService;
	public GamerManager(PersonCheckService personCheckService) {
	
		this.personCheckService = personCheckService;
	}

	@Override
	public void buyGame() {
		System.out.println("Oyunu satýn aldýn gamer");
		
	}
	
	@Override
	public void add(Person person) throws Exception{
		
		if(personCheckService.checkIfRealPerson(person)) {
			super.add(person);
		}else {
			throw new Exception("Kiþi doðrulanamadý..");
		}
		
	}
	

}
