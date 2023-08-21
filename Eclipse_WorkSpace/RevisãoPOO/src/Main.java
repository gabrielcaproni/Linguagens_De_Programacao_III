
public class Main {
	public static void main(String[] args) {
		
		Student maria = new Student(1, 999);
		maria.setName("Maria");
		maria.setBirthDate("11/06/2000");
		maria.setCourse("Sitemas de Informação");
		maria.setSemester((short)4);
		
		Professor gabriel = new Professor(2, "217");
		gabriel.setName("Gabriel");
		gabriel.setLevel("Bacharel");
		gabriel.setArea("Informatica");
		
		AT ju = new AT(3, "891");
		ju.setName("Júlia");
		ju.setArea("TI");
		ju.setRole("Técnica de laboratório");
		
		printUserData(maria);
		printUserData(gabriel);
		printUserData(ju);
	}
	
	private static void printUserData(User user){
		System.out.println(user.formatPersonalDate());
	}
			
}