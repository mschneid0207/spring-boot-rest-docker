package de.mschneid;

public class User {

	private String mail;
	private String password;
	private String lastName;
	private String name;
	private String address;

	public User() {
		// default constructor
	}

	public User(String mail, String password, String lastName, String name, String address) {
		this.mail = mail;
		this.password = password;
		this.lastName = lastName;
		this.name = name;
		this.address = address;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
