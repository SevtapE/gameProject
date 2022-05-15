package gameProject.entities;


import gameProject.abstracts.Entity;
import gameProject.abstracts.Person;

public class Gamer extends Person implements Entity{
	private int score;

	public Gamer() {
		
	}
	public Gamer(int id, String firstName, String lastName, String nationalityId, int dateofBirthYear, String email,
			String password) {
		super(id,  firstName,  lastName,  nationalityId,  dateofBirthYear,  email,
				 password);
		
	}

	public int getScore() {
		return score;
	}

	

}
