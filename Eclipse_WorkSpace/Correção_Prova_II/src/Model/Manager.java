package Model;

public class Manager extends Employee{

	private int subordinados;
	private double percentPerSubordinado;
	private int doneProjects;
	private double bonusPerProjects;
	
	public Manager(String name, double salary, int sub, double percent, int dones, double bonusProj) {
		super(name, "Gerente", salary);
		
		this.subordinados = sub;
		this.percentPerSubordinado = percent/100;
		this.doneProjects = dones;
		this.bonusPerProjects = bonusProj;
	}
	
	@Override
	public double salary() {
		//Implementação da forma de calculo do salário desse tipo de funcionário
		double valuePerSub = getSalary() * percentPerSubordinado;
		double extraBonus = valuePerSub * subordinados;
		double projectBonus = doneProjects * bonusPerProjects;
		
		return baseSalary() + extraBonus + projectBonus;
	}
}
