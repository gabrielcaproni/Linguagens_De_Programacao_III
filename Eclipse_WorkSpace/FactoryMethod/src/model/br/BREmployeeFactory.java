package model.br;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeType;

public class BREmployeeFactory implements EmployeeFactory{
	
	public Employee creatEmployee(EmployeeType type) {
		
		if(type == null) return null;
		
		if(type == EmployeeType.MANAGER)
			return new ManagerBR();
		
		return new ProgramerBR();
	}
}
