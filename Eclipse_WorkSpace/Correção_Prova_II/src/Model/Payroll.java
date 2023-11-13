package Model;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
	
	private List<Employee> employees;
	
	public Payroll() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(String pk) {
		Employee employee = DataBase.get(pk);
		employees.add(employee);
	}
	
	public List<Employee> getEmployees(){
		return this.employees;
	}
	
	public double total() {
		double total = 0;
		
		for (Employee employee : employees) {
			total += employee.salary();
		}
		
		return total;
	}
}
