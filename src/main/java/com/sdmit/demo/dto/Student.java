package com.sdmit.demo.dto;

public class Student {
	private String id;
	private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
   
    
	public Student(String id, String firstName, String lastName, String email, String mobileNumber) {
		 this.id=id;
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.email=email;
		 this.mobileNumber=mobileNumber;
		  
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
