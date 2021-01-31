package com.psl.training.oop.ordermanagement;

public class Customer {

	private int id;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Customer(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public void printPhoneNumbers()
	{
		System.out.println("Homephone no: "+homePhone);
		System.out.println("Cell phone no :"+cellPhone);
		System.out.println("Work phone no :"+workPhone);
	}
	public void printShippingAddress()
	{
		System.out.println("Street :"+street);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
		System.out.println("Zip code:"+zip);
	}
	
	public void setPrintingAddress(String stret,String cty,String st,int zipcode)
	{
		street=stret;
		city=cty;
		state=st;
		zip=zipcode;
	}
	public void setPhoneNumbers(String home,String cell,String work)
	{
		homePhone=home;
		workPhone=work;
		cellPhone=cell;
	}
	public void printCustomerData() {
		System.out.println("Customer id :"+id);
		System.out.println("Customer name:"+name);
		printPhoneNumbers();
		printShippingAddress();
	}
}
