
package view;

import model.Product;
import model.Venda;
import model.ItemVenda;

public class Main {
		
	public static void main(String[] args) {
		
		Product prod1 = new Product("Arroz", 2, 45.0);
		Product prod2 = new Product("Feijão", 4, 40.0);
		
		ItemVenda item1 = new ItemVenda(prod1, 2);
		ItemVenda item2 = new ItemVenda(prod2, 4);
		
		Venda venda = new Venda();
		
		venda.adicionarItem(item1);
		venda.adicionarItem(item2);
		
		venda.imprimirNota();
	}

}
