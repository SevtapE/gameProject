package gameProject.abstracts;


public abstract class Person {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int dateofBirthYear;
	private String email;
	private String password;
	
	public Person() {
		
	}
	public Person(int id, String firstName, String lastName, String nationalityId, int dateofBirthYear, String email,
			String password) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateofBirthYear = dateofBirthYear;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getdateofBirthYear() {
		return dateofBirthYear;
	}
	public void setdateofBirthYear(int dateofBirthYear) {
		this.dateofBirthYear = dateofBirthYear;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
