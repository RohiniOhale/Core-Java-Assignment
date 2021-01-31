package com.psl.training.exception;

import java.util.Date;
import java.util.Scanner;

public class ContactTester {
	public static void main(String[] args)  {
		/*Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name:");
	String fnm=sc.next();
	//System.out.println("Enter middle name:");
	//String mnm=sc.next();
	System.out.println("Enter last name:");
	String lnm=sc.next();
	System.out.println("Enter date of birth:");
	String dob=sc.next();
	/*System.out.println("Enter gender:");
	String gen=sc.next();
	System.out.println("Enter annniversary:");
	String anniver=sc.next();
	System.out.println("Enter address:");
	String add=sc.next();
	System.out.println("Enter area:");
	String area=sc.next();
	System.out.println("Enter city:");
	String cty=sc.next();
	System.out.println("Enter pincode:");
	int pin=sc.nextInt();
	System.out.println("Enter state:");
	String st=sc.next();
	System.out.println("Enter country:");
	String cntry=sc.next();*/
	/*System.out.println("Enter telephone no:");
	String tel=sc.next();
	System.out.println("Enter mobile no:");
	String mobno=sc.next();
	System.out.println("Enter email:");
	String email=sc.next();
//	System.out.println("Enter website:");
	//String web=sc.next();
		
	sc.close();
		*/
	Contact c=new Contact();
	c.setEmail("abc@gmail.com");
	c.setFirstname("Chinu");
	c.setLastname("OHale");
	c.setDateofbirth("17/07/1998");
	c.setMobile_number("9168378270");
	c.setTelephone_number("");
	
	MyStack mst=new MyStack();
	mst.initializeStack(3);
	
	c.validate();
	/*mst.push(c.getFirstname());
	mst.push(c.getLastname());
	mst.push(c.getEmail());
	mst.pop();
	mst.pop();
	mst.pop();
	mst.pop();
	mst.printStack();*/
	}

}
