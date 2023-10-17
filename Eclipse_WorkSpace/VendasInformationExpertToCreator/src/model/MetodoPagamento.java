package model;

public interface MetodoPagamento {
	String description();
	Double value(Double saleValue);
}
