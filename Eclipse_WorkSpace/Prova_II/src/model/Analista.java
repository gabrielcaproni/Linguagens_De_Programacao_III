package model;

public class Analista implements Salario{

	@Override
	public double salarioFixo(double salario) {
		return salario + 100;
	}
	
}
