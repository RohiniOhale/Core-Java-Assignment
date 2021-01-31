package com.psl.training.oop.inventory_system;

public class StockItem {
private int itemNumber;
private String itemDescription;
private double itemprice;
private String itemname;
private int quantity;


public int getQuantity() {
	return quantity;
}


public void setItemNumber(int itemNumber) {
	this.itemNumber = itemNumber;
}


public void setItemDescription(String itemDescription) {
	this.itemDescription = itemDescription;
}


public void setItemprice(double itemprice) {
	this.itemprice = itemprice;
}


public void setItemname(String itemname) {
	this.itemname = itemname;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public int getItemNumber() {
	return itemNumber;
}


public String getItemDescription() {
	return itemDescription;
}


public double getItemprice() {
	return itemprice;
}


public String getItemname() {
	return itemname;
}

}
