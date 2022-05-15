package gameProject.abstracts;

public abstract class PersonManager implements PersonService {

	@Override
	public void add(Person person) throws Exception{
		System.out.println("Ki�i eklendi : "+person.getFirstName());
		
	}

	@Override
	public void remove(Person person) {
		System.out.println("Ki�i silindi : "+person.getFirstName());
		
	}

	@Override
	public void update(Person person) {
		System.out.println("Ki�i g�ncellendi : "+person.getFirstName());
		
	}

}
