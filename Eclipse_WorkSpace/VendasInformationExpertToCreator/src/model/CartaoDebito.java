package model;

public class CartaoDebito implements MetodoPagamento{

	private double discount;
	
	public CartaoDebito(double discount) {
		this.discount = discount/100;
	}
	
	@Override
	public String description() {
		return "Cartão Débito";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (saleValue * this.discount);
		
		return value;
	}

}
