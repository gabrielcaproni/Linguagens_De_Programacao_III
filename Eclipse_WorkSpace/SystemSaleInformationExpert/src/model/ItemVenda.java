package model;

public class ItemVenda {
	private Product product;
	private int amount;
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public ItemVenda(String productCode, int amount) {
		String[] prodDesc = DataBase.getProductDescription(productCode);
		
		String productDescription = prodDesc[0];
		double productPrice = Double.parseDouble(prodDesc[1]);
		
		this.product = new Product(productDescription, productPrice);
		this.amount = amount;
	}
	
	public double calc() {
		return product.getPrice() * amount;
	}
}
