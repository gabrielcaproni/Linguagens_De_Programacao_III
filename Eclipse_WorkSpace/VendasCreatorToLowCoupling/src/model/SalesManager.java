package model;

import java.util.HashMap;
import java.util.Map;

public class SalesManager {
	
	private Stock stock;
	private Sale sale;
	
	public void StockManager() {
		stock = new Stock();
		sale = null;
	}
    
	public void openSale() {
		sale = new Sale();
	}
	
	public void closeSale() {
		sale = null;
	}
	
	public boolean isOpen() {
		return sale != null;
	}
	
	public boolean addItem(String codProduct, int amount) {
		
		if(!isOpen())
			return false;
		
		if(stock.hasAmount(codProduct, amount)) {
			sale.addItem(codProduct, amount);
			stock.removeFromStock(codProduct, amount);
			return true;
		}
		
		return false;
	}
	
}
