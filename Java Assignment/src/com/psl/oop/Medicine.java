package com.psl.oop;

public class Medicine {
	private String name;
	private String address;

	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void displayLabel()
	{
		System.out.println("Name :"+name+"\n Address :"+address);
	}
}
