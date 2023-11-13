package Model;

public class TecLeader extends Employee{

	private int subordinados;
	private double percentPerSubordinado;
	
	public TecLeader(String name, double salary, int sub, double percent) {
		super(name, "Líder Técnico", salary);
		
		this.subordinados = sub;
		this.percentPerSubordinado = percent/100;
	}
	
	@Override
	public double salary() {
		//Implementação da forma de calculo do salário desse tipo de funcionário
		double valuePerSub = getSalary() * percentPerSubordinado;
		double extraBonus = valuePerSub * subordinados;
		
		return baseSalary() + extraBonus;
	}
}
