package com.psl.training.oop.ordermanagement;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1=new Customer(1,"David");
		c1.setPhoneNumbers("072100565","999999999999","888888888");
		c1.setPrintingAddress("Alok nagar","Varanasi","Uttar Pradesh",444806);
		c1.printCustomerData();
		c1.printPhoneNumbers();
		c1.printShippingAddress();
		
		Customer c2=new Customer(2,"Jones");
		c2.setPhoneNumbers("0721895","77777777999","555588888");
		c2.setPrintingAddress("Gandhi nagar","Bhopal","Madhya Pradesh",444006);
		c2.printCustomerData();
		c2.printPhoneNumbers();
		c2.printShippingAddress();
		
		Customer c3=new Customer(3,"Grace");
		c3.setPhoneNumbers("0724325","77555777999","522228888");
		c3.setPrintingAddress("Gopal nagar","Amravati","Maharastra",408906);
		c3.printCustomerData();
		c3.printPhoneNumbers();
		c3.printShippingAddress();
	}

}
