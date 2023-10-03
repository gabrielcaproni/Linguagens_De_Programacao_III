package model;

import java.util.ArrayList;
import java.util.List;

public class Venda{
	
	private List<ItemVenda> itens = new ArrayList<>();
	
	public void adicionarItem(String productCode, int amount) {
        ItemVenda item = new ItemVenda(productCode, amount);
    }
	
	public List<String> getItems(){
		List<String> saleItemsString = new ArrayList<>();
		
		for(ItemVenda it : this.itens) {
			String item = String.format("%s - %d - %.2f - %.2f", it.getProduct().getName(), it.getAmount(), it.get )
		}
	}
	
	public double calcularTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total += item.calc();
        }
        return total;
    }
	
	public void imprimirNota() {
        System.out.println("*** Nota de Venda ***");
        for (ItemVenda item : itens) {
            System.out.println(item);
        }
        System.out.println("_________________________________");
        System.out.println("Total da Venda: R$" + calcularTotal());
    }
}
