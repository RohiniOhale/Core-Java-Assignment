package com.psl.training.oop.inventory_system;



public class PurchaseOrder {

	private int poNumber;
	private String orderDate;
	private String shipDate;
	private String custname;
	
	public boolean isShipped() {
		if(shipDate != null)
			return true;
		else
			return false;
	}
	public double sumItems() {
		return 0.0;
		
	}
	public void setShipDate(String date) {
		shipDate=date;
		
	}
	public void create(int poNo,String orderDt,String nm)
	{
		poNumber=poNo;
		orderDate=orderDt;
		custname=nm;
	}
	
	
	public OrderItem getOrderItems()
	{
		OrderItem o=new OrderItem();
		int no=o.getNumberOfItems();
		System.out.println(no);
		StockItem s[]=new StockItem[3];
		s=o.getStockItem();
		for(StockItem i:s)
			System.out.println(s);
		return o;
	}
	public int getPoNumber() {
		return poNumber;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public String getCustname() {
		return custname;
	}
	
}
