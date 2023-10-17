package model;

public class Dinheiro_Pix implements MetodoPagamento{

	private double discount;
	
	public Dinheiro_Pix(double discount) {
		this.discount = discount/100;
	}
	
	@Override
	public Double value(Double saleValue) {
		double value = saleValue - (this.discount * saleValue);
		
		return value;
	}

	@Override
	public String description() {
		return "Dinheiro/Pix";
	}

}
