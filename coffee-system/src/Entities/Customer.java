package Entities;

import java.time.LocalDate;

public class Customer {
	private int id;
	private  String FirstName;
	private  String LastName;
	private LocalDate DateOfBirth;
	private String NationalityId;
	
	
	public Customer(int id,String FirstName,String LastName,LocalDate DateOfBirth,String NationalityId) {
		this.id=id;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.DateOfBirth=DateOfBirth;
		this.NationalityId=NationalityId;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	
}
