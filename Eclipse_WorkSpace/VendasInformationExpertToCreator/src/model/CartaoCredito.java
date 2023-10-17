package model;

public class CartaoCredito implements MetodoPagamento{

	private double interest;
	
	
	public CartaoCredito(double interest) {
		this.interest = interest/100;
	}
	
	@Override
	public String description() {
		return "Cartão Crédito";
	}

	@Override
	public Double value(Double saleValue) {
		double value = saleValue + (saleValue * this.interest);
		
		return value;
	}
	
}
