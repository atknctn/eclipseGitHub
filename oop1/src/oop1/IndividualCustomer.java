package oop1;

public class IndividualCustomer extends Customer {
	//extends derken IndividualCustomer`a sende Customer`sın diyoruz.
	private String firstName;
	private String lastName;
	//sağ tık Source Generate Getters and Setters
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
	
}
