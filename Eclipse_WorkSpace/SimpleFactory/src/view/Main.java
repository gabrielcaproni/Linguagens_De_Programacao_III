package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeFactory.EmployeeType;

public class Main {

	public static void main(String[] args) {
		
		Employee e = EmployeeFactory.creatEmployee(EmployeeType.ANALYST, "Gabriel", 2000, 0, 
				0, 0, 0, 0);
		
		System.out.println(e);

	}

}
