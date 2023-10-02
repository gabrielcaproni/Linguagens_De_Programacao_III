package model;

public class ItemVenda {
	private Product prod;
	private double qtd;
	
	public ItemVenda(Product product, int qtd) {
		this.prod = product;
		this.qtd = qtd;
	}
	
	public double calc() {
		return prod.getPrice() * qtd;
	}
	 
	@Override
	public String toString() {
	        return prod + " - Quantidade: " + qtd + " - Total: R$" + calc();
	    }
}
