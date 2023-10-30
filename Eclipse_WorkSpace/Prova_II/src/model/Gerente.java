package model;

public class Gerente implements Salario{

	@Override
	public double salarioFixo(double salario) {
		return salario + 250 + (0.1 * 100);
	}
	
}
