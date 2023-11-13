package model;

public class LiderTecnico implements Salario{

	@Override
	public double salarioFixo(double salario) {
		return salario + 150 + (0.5 * 100);
	}

}
