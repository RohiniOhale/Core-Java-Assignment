package com.psl.oop;



public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine obj[]=new Medicine[10];
		
		int rand=(int)(Math.random()*3)+1;
		//System.out.println(rand);	
		obj[rand]=new Medicine();
		obj[rand].setName("Catarol");
		obj[rand].setAddress("Maharastra");
		obj[rand].displayLabel();
		Medicine obj1=new Medicine();
		obj1.setAddress("Pune");
		obj1.setName("O2");
		obj1.displayLabel();
		Ointment oi=new Ointment();
		oi.displayLabel();
		Syrup sp=new Syrup();
		sp.displayLabel();
		Tablet tb=new Tablet();
		tb.displayLabel();
	}

}
