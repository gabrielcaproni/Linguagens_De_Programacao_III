package model;

public class Product {
	private String description;
	private double price;
	private double stock;
	
	public Product(String description, double price) {
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getEstoque() {
		return stock;
	}

	public void diminuirEstoque(int amount) {
        if (stock >= amount) {
            stock -= amount;
        } else {
            System.out.println("Estoque insuficiente para " + description);
        }
    }
}