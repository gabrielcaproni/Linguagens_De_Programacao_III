package Model;

public abstract class Employee {
	private String name;
	private String role;// Cargo
	private double salary;
	private double perExtraHourValue;
	private double extraHours;
	
	public Employee(String name, String role, double salary) {
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
	
	public double getPerExtraHourValue() {
		return perExtraHourValue;
	}

	public void setPerExtraHourValue(double perExtraHourValue) {
		this.perExtraHourValue = perExtraHourValue;
	}
	
	public double getExtraHours() {
		return extraHours;
	}
	
	public void setExtraHours(double extraHours) {
		this.extraHours = extraHours;
	}
	
	protected double baseSalary() {
		double extraEarnings = getExtraHours() * getPerExtraHourValue();
		
		return salary + extraEarnings;
	}

	public abstract double salary();
}
