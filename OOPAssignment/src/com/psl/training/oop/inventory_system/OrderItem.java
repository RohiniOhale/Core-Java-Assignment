package com.psl.training.oop.inventory_system;

public class OrderItem {
	private StockItem stockItem[];
	private int numberOfItems;
	public StockItem[] getStockItem() {
		return stockItem;
	}
	
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public void setStockItem(int quant,StockItem s) {
		for(StockItem i:stockItem)
		{
			if(i==s)
			{
				i.setQuantity(s.getQuantity()-quant);
			}
		}
		
	}
	
	
	
	public double getTotal(StockItem s,int quant) {
		double total=0.0;
		
		total=quant*s.getItemprice();
		return total;
	}
}
