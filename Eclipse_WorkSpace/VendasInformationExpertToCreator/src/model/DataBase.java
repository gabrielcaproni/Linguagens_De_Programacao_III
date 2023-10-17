package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private static Map<String, String[]> products = new HashMap();
	private static Map<String, MetodoPagamento> paymments = new HashMap();
	
	static {
		products.put("arroz", new String[] {"Arroz Tipo 1", "20"});
		products.put("feijao", new String[] {"Feijão Malícia", "30"});
		products.put("sal", new String[] {"Sal Marino", "8"});
		
		paymments.put("cc", new CartaoCredito(5));
		paymments.put("cd", new CartaoDebito(0));
		paymments.put("c", new Dinheiro_Pix(5));
	}
	
	public static String[] getProductDescription(String key) {
		return products.get(key);
	}
	
	public static MetodoPagamento getPaymment(String key) {
		return paymments.get(key);
	}
}
