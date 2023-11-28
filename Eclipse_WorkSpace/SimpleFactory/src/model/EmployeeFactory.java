package model;

public class EmployeeFactory {

	public enum EmployeeType{
		ANALYST, 
		ARCHITECT,
		MANAGER,
		TECLEADER;
	}
	
	public static Employee creatEmployee(EmployeeType id, String name, double salary, 
			int subs, double percent, int projects, int doneProjs, double bonusProj) {
		
		switch (id) {
		
		case ANALYST:{
			
			return new Analyst(name, salary);
		}
		
		case ARCHITECT:{
			
			return new Architect(name, salary, projects, percent);
		}
		
		case MANAGER:{
			
			return new Manager(name, salary, subs, percent, doneProjs, bonusProj);
		}
		
		case TECLEADER:{
			
			return new TecLeader(name, salary, subs, percent);
		}
		
		default:
			return null;
		}
	}
}
