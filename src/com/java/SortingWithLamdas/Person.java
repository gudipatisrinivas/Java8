package com.java.SortingWithLamdas;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private int employeeID;

	public Person(String firstName, String lastName, int employeeID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
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

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String toString() {
		return getFirstName()+"\t\t"+getLastName()+"\t\t"+getEmployeeID()+"\t\t";
	}
	
}
