package Model;

public class Architect extends Employee{
	
	private int projects;
	private double percentualPerProject;
	
	public Architect(String name, double salary, int projects, double percentual) {
		super(name, "Arquiteto", salary);
		this.projects = projects;
		this.percentualPerProject = percentual/100;
	}
	
	@Override
	public double salary() {
		//Implementação da forma de calculo do salário desse tipo de funcionário
		double baseSalary = getSalary();
		double extraEarnings = getExtraHours() * getPerExtraHourValue();
		double bonusPerProject = getSalary() * percentualPerProject;
		double extraBonus = bonusPerProject * this.projects;
		
		return baseSalary() + extraBonus;
	}
}
