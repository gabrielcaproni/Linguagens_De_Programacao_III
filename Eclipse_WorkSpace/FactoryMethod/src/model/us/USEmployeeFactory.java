package model.us;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeType;

public class USEmployeeFactory implements EmployeeFactory{

	public Employee creatEmployee(EmployeeType type) {
	
		if(type == null) return null;
	
		if(type == EmployeeType.MANAGER)
			return new ManagerUS();
	
		return new ProgramerUS();	
	}
}
