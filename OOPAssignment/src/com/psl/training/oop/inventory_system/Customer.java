package com.psl.training.oop.inventory_system;

public class Customer {
	private int customernumber;
	private String name;
	private String homePhone;
	private String cellPhone;
	private String workPhone;
	private String street;
	private String city;
	private String state;
	private String zip;
	private PurchaseOrder p0;
	
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
	public void setPrintingAddress(String stret,String cty,String st,String zipcode)
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
	public void print() {
		System.out.println("Customer id :"+customernumber);
		System.out.println("Customer name:"+name);
		printPhoneNumbers();
		printShippingAddress();
	}
	public void getPurchaseOrders(PurchaseOrder p)
	{
		p.getCustname();
		p.getPoNumber();
		p.getOrderItems();
	
	
	}
	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
