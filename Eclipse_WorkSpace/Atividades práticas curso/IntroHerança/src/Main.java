
public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p1.setIdade(30);
		p1.setSexo("Masculino");
		
		p2.setNome("Maria");
		p2.setIdade(15);
		p2.setMatri(123);
		p2.setCurso("Técnico em informática");
		p2.setSexo("Feminino");
		
		p3.setNome("Claudio");
		p3.setEspecialidade("Desenvolvimento WEB");
		p3.setIdade(45);
		p3.setSalario(10.000f);
		p3.setSexo("Masculino");
		
		p4.setNome("Fabiana");
		p4.setSetor("Estoque");
		p4.setIdade(49);
		p4.setSexo("Feminino");
		p4.setTrabalhando(true);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
