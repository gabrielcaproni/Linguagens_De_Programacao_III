import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private String nome;
	private double precoCusto;
	private List<Imposto> impostos;
	private double margemLucro;
	
	public Produto(String nome, double precoCusto, double margemLucro){
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.impostos = new ArrayList<>();
		this.margemLucro = margemLucro;
	}
	
	public String getNome() {
        return nome;
    }
	
	public void insereImposto(Imposto imposto) {
        impostos.add(imposto);
    }
	
//	public double calcPrecoVenda(){
//		
//		 double totalImpostos = 0;
//		 
//		 for(Imposto imposto : impostos) 
//			 totalImpostos += imposto.calcImpost(precoCusto);
//		 
//		 double precoVenda = precoCusto + totalImpostos;
//		 
//         return  precoVenda + (precoVenda * margemLucro);
//    	}
	
}
