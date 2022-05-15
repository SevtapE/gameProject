package gameProject.entities;


import gameProject.abstracts.Entity;
import gameProject.abstracts.Person;

public class GameProvider extends Person implements Entity {
	
	private String taxNumber;

	public GameProvider() {
		
	}
	public GameProvider(int id, String firstName, String lastName, String nationalityId, int dateofBirthYear, String email,
			String password,String taxNumber) {
		super( id,  firstName,  lastName,  nationalityId,  dateofBirthYear,  email,
				 password);
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
