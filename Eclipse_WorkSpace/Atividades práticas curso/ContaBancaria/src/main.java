
public class main {

	public static void main(String[] args) {
		contaBanco c1 = new contaBanco();	
		
		c1.setNumConta(111);
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		
		contaBanco c2 = new contaBanco();
		c2.setNumConta(222);
		c2.setDono("Creuza");
		c2.abrirConta("CP");
		
		c1.depositar(100);
		c2.depositar(500);
		c2.sacar(100);
		
		c1.sacar(150);
		c1.fecharConta();
		
		c2.sacar(550);
		c2.fecharConta();
		
		c1.estadoAtual();
		c2.estadoAtual();
	}

}
