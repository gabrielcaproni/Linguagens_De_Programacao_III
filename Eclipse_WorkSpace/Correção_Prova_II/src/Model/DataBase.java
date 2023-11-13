package Model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	public static Map<String, Employee> data = new HashMap<>();
	
	static {
		data.put("maria", new Analyst("Maria Isabel", 4800.50));
		data.put("jose", new Analyst("Maria Isabel", 2800.00));
		data.put("pedro", new Architect("Pedro H.", 8800.00, 3, 2));
		data.put("joao", new Architect("João", 7800.00, 1, 2));
		data.put("paula", new TecLeader("Paula", 10000.00, 7, 5));
		data.put("seila", new Manager("Seila", 12000.00, 8, 1, 2, 800));
	}
	
	public static Employee get(String pk) {
		return data.get(pk);
	}
}
