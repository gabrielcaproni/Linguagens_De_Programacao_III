
package view;

import model.Venda;

public class Main {
		
	public static void main(String[] args) {
		
		Venda venda = new Venda();
		
		venda.adicionarItem("arroz", 3);
		venda.adicionarItem("feijao", 2);
		venda.adicionarItem("sal", 1);
		
		venda.imprimirNota();
	}

}
