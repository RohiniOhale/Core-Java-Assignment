package com.psl.training.exception;

import java.util.Date;


public class Contact {
	private String firstname;
	private String middlename;
	private String lastname;
	private String dateofbirth;
	private String gender;
	private String anniversary;
	private String address;
	private String area;
	private String city;
	private int pincode;
	private String state;
	private String country;
	private String telephone_number;
	private String mobile_number;
	private String email;
	private String website;
	
public void validate() {
	
	 MyStack mst=new MyStack();
	mst.initializeStack(16);
	mst.push(middlename);
	mst.push(gender);
	mst.push(anniversary);
	mst.push(address);
	mst.push(area);
	mst.push(city);
	mst.push(state);
	mst.push(country);
	mst.push(mobile_number);
	mst.push(telephone_number);
	mst.push(email);
	mst.push(dateofbirth);
	mst.push(lastname);
	mst.push(firstname);
	if(firstname.length()<=0)
	{
		mst.pop();
		System.out.println("Please enter first name ");
	}
	 if(lastname.length()<=0)
	{
		 mst.pop();
		System.out.println("Please enter last name ");
	}
	 if (dateofbirth.length()<=0)
	{
		 mst.pop();
		System.out.println("Please enter date  ");
	}
	 if(email!=null)
		{
		 
			 String emreg = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			 boolean res=email.matches(emreg);
			 if(!res){
				 mst.pop();
				 System.out.println("Email is not correct format.");
			 }
		}
	 if(telephone_number.length()<=0 && mobile_number.length()<=0)
	{
		 if(telephone_number.length()<=0)
			 mst.pop();
		 else
			 mst.pop();
		System.out.println("Enter any one of the mobile nos");
	}
	 
	
	
		mst.printStack();
	 
	
	
	
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public void setMiddlename(String middlename) {
	this.middlename = middlename;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}

public void setGender(String gender) {
	this.gender = gender;
}

public void setAnniversary(String anniversary) {
	this.anniversary = anniversary;
}

public void setAddress(String address) {
	this.address = address;
}

public void setArea(String area) {
	this.area = area;
}

public void setCity(String city) {
	this.city = city;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public void setState(String state) {
	this.state = state;
}

public void setCountry(String country) {
	this.country = country;
}

public void setTelephone_number(String telephone_number) {
	this.telephone_number = telephone_number;
}

public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}

public void setEmail(String email) {
	this.email = email;
}

public void setWebsite(String website) {
	this.website = website;
}

public String getFirstname() {
	return firstname;
}

public String getMiddlename() {
	return middlename;
}

public String getLastname() {
	return lastname;
}

public String getDateofbirth() {
	return dateofbirth;
}

public String getGender() {
	return gender;
}

public String getAnniversary() {
	return anniversary;
}

public String getAddress() {
	return address;
}

public String getArea() {
	return area;
}

public String getCity() {
	return city;
}

public int getPincode() {
	return pincode;
}

public String getState() {
	return state;
}

public String getCountry() {
	return country;
}

public String getTelephone_number() {
	return telephone_number;
}

public String getMobile_number() {
	return mobile_number;
}

public String getEmail() {
	return email;
}

public String getWebsite() {
	return website;
}

	
	
}
