package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<StockItem> items;
    
    public Stock() {
    	items = DataBase.stockItems();
    }
    
    public boolean hasAmount(String codProduct, int amount) {
    	Product p = DataBase.getProducts(codProduct);
    	
    	for(StockItem stockItem : items) {
    		Product pInStock = stockItem.getProduct();
    		
    		if(p.getDescription().equals(pInStock.getDescription())) {
    			return stockItem.getAmount() >= amount;
    		}
    	}
    	
    	return false;
    }
    
    public void removeFromStock(String codProduct, int amount) {
    	Product p = DataBase.getProducts(codProduct);
    	
    	for(StockItem stockItem : items) {
    		Product pInStock = stockItem.getProduct();
    		
    		if(p.getDescription().equals(pInStock.getDescription())) {
    			stockItem.removeFromStock(amount);
    		}
    	}
    }
    
}

