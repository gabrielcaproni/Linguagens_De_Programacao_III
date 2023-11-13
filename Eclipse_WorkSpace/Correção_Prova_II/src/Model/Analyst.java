package Model;

public class Analyst extends Employee{
	
	public Analyst(String name, double salary) {
		super(name, "Analyst", salary);
	}
	
	@Override
	public double salary() {
		//Implementação da forma de calculo do salário desse tipo de funcionário
		
		return baseSalary();
	}
}
