package model;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private static Map<String, String[]> products = new HashMap();
	
	private static Map<String, Paymmnet> paymmnets = new HashMap<>();
	
	private static Map<String, StockItem> stockItem = new HashMap<>();
	
	static {
		products.put("arroz", new String[] {"Arroz Tipo 1", "20"});
		products.put("feijao", new String[] {"Feijão Malícia", "30"});
		products.put("sal", new String[] {"Sal Marino", "8"});
		
		stockItem.put("Arroz", new StockItem(new Product("Arroz Tipo 1", 20), 5));
		stockItem.put("Fejão", new StockItem(new Product("Feijão Malícia", 30), 5));
		stockItem.put("sal", new StockItem(new Product("Sal Marino", 8), 5));
		
		Paymmnet credit = new Credit(5);
		
		paymmnets.put("cc", credit);
		paymmnets.put("cd", new Debit(0));
		paymmnets.put("c", new Cash(5));
	}
	
	public List<StockItem> stockItems(){
		
		List<StockItem> items = new ArrayList<>();
		
		for(StockItem stockItem : this.stockItem.values()) {
			items.add(stockItem);
		}
		
		return items;
	}
	
	public static String[] getProductDescription(String key) {
		return products.get(key);
	}
	
	public static Paymmnet getPaymmnet(String key) {
		return paymmnets.get(key);
	}

	public static Product getProducts(String codProduct) {	
		String[] dataProduct = products.get(codProduct);
		
		if(dataProduct != null) {
			Product p = new Product(dataProduct[0], Integer.getInteger((dataProduct[1])));
			
			return p;
		}
		
		return null;
	}
	
	
}
