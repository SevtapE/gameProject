package gameProject.abstracts;

public abstract class PersonManager implements PersonService {

	@Override
	public void add(Person person) throws Exception{
		System.out.println("Kiþi eklendi : "+person.getFirstName());
		
	}

	@Override
	public void remove(Person person) {
		System.out.println("Kiþi silindi : "+person.getFirstName());
		
	}

	@Override
	public void update(Person person) {
		System.out.println("Kiþi güncellendi : "+person.getFirstName());
		
	}

}
