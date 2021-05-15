package passwordApplication.entities.concretes;

import passwordApplication.entities.abstracts.Entity;

public class User implements Entity{
	private int Id;
	private String name;
	private String lastName;
	private String email;
	private String password;
	private boolean verification=false;
	
	
	public User() {
		
	}

	public User(int id, String name, String lastName, String email, String password) {
		super();
		Id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public boolean isVerification() {
		return verification;
	}

	public void setVerification(boolean verification) {
		this.verification = verification;
	}
	
	
	
}
