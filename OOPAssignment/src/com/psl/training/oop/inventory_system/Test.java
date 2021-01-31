package com.psl.training.oop.inventory_system;



public class Test {
public static void main(String[] args) {
	Customer c1=new Customer();
	c1.setCustomernumber(1);
	c1.setName("Jamie");
	c1.setPhoneNumbers("88555555", "5646689695","5646454848");
	c1.setPrintingAddress("Gopal Nagar","Amravati","Maharastra","444806");
	
	Customer c2=new Customer();
	c2.setCustomernumber(2);
	c2.setName("Bill");
	c2.setPhoneNumbers("88577755", "56111189695","55556454848");
	c2.setPrintingAddress("Magarpatta","Pune","Maharastra","445556");
	
	Customer c3=new Customer();
	c3.setCustomernumber(3);
	c3.setName("Joe");
	c3.setPhoneNumbers("88566665", "5611229695","55121254848");
	c3.setPrintingAddress("Alok Nagar","Nagpur","Maharastra","448556");
	
	StockItem st1=new StockItem();
	st1.setItemNumber(1);
	st1.setItemname("Milk");
	st1.setItemDescription("Amul milk");
	st1.setItemprice(48);
	st1.setQuantity(10);
	
	StockItem st2=new StockItem();
	st2.setItemNumber(2);
	st2.setItemname("Chicken");
	st2.setItemDescription("Chicken");
	st2.setItemprice(85);
	st2.setQuantity(10);
	
	StockItem st3=new StockItem();
	st3.setItemNumber(3);
	st3.setItemname("Egg");
	st3.setItemDescription("Fresh Egg");
	st3.setItemprice(10);
	st3.setQuantity(13);
	
	StockItem st4=new StockItem();
	st4.setItemNumber(4);
	st4.setItemname("Apple");
	st4.setItemDescription("Fresh Apple");
	st4.setItemprice(60);
	st4.setQuantity(20);
	
	StockItem st5=new StockItem();
	st5.setItemNumber(5);
	st5.setItemname("Orange");
	st5.setItemDescription("Nagpur Oranges");
	st5.setItemprice(50);
	st5.setQuantity(20);

	PurchaseOrder po1=new PurchaseOrder();
	OrderItem o1[]=new OrderItem[3];
	o1[0].setStockItem(2,st1);
	o1[1].setStockItem(2, st2);
	o1[2].setStockItem(12, st3);
	po1.create(1,"1/01/21","Jamie");
	
	
	
	
	
	
	PurchaseOrder po2=new PurchaseOrder();
	OrderItem o2[]=new OrderItem[2];
	o2[0].setStockItem(5, st4);
	o2[0].setStockItem(10, st5);
	po2.create(2,"2/01/21","Jamie");
	po2.getOrderItems();
	
	PurchaseOrder po3=new PurchaseOrder();
	OrderItem o3[]=new OrderItem[2];
	/*o3[0].setStockItem(5, st2);
	o3[0].setStockItem(10, st4);*/
	po3.create(1,"3/01/21","Bill");
//	po3.getItems();
	
	po1.setShipDate("17/01/2021");
	System.out.println("Order "+po1.getPoNumber()+" placed for "+po1.getCustname());
	po3.setShipDate("17/01/2021");
	System.out.println("Order "+po3.getPoNumber()+" placed for "+po3.getCustname());
	po2.setShipDate("17/01/2021");
	System.out.println("Order "+po2.getPoNumber()+" placed for "+po2.getCustname());
}
	}
