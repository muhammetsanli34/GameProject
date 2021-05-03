package Entities;

public class Player{
	
	private int id;
	private String firstName;
	private String lastName;
	private String birthyYear;
	private String nationalityId;
	
	public Player(int id, String firstName, String lastName, String birthyYear, String nationalityId) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthyYear = birthyYear;
		this.nationalityId = nationalityId;
	}
	
	public Player()
	{
		
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

	public String getBirthyYear() {
		return birthyYear;
	}

	public void setBirthyYear(String birthyYear) {
		this.birthyYear = birthyYear;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
}
