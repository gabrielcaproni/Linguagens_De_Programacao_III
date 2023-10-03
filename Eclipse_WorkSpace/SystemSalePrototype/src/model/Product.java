package model;

public class Product {
	private String name;
	private double priceUn;
	
	public Product(String name, double quantity, double priceUn) {
		super();
		this.name = name;
		this.priceUn = priceUn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return priceUn;
	}
	public void setPrice(double valorUn) {
		this.priceUn = valorUn;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
