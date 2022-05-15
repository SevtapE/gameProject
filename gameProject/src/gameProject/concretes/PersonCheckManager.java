package gameProject.concretes;

import gameProject.abstracts.Person;
import gameProject.abstracts.PersonCheckService;

public class PersonCheckManager implements PersonCheckService {

	@Override
	public Boolean checkIfRealPerson(Person person) {
		//This is my fake service implementation
		return true;
	}

}
