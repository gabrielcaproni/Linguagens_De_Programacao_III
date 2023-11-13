package model;

public class Arquiteto implements Salario{

	@Override
	public double salarioFixo(double salario) {
		return salario + 200 + (0.2 * 100);
	}
	
}
