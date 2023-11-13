package View;

import Model.Employee;
import Model.Payroll;

public class Main {

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		payroll.addEmployee("maria");
		payroll.addEmployee("jose");
		
		for(Employee employee : payroll.getEmployees()) {
			System.out.println("Nome:" + employee.getName());
			System.out.println("Cargo:" + employee.getRole());
			System.out.println("Salário R$:" + employee.getSalary());
			System.out.println();
		}
		
		System.out.println("Total da folha: " + payroll.total());
	}
}
