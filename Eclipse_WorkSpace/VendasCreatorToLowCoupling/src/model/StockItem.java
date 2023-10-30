package model;

public class StockItem {
	
	private Product product;
	private double amount;
	
	public StockItem(Product p, double a) {
		this.product = p;
		this.amount = a;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public removeFromStock(int amount) {
		this.amount -= amount;
	}
	
}
