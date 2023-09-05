package model;
import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private String nome;
	private double precoCusto;
	private List<Imposto> impostos;
	private double margemLucro;
	
	public Produto(String nome, double precoCusto, double margemLucro) throws Exception{
		setNome(nome);
		setPrecoCusto(precoCusto);
		setMargemLucro(margemLucro);
		this.impostos = new ArrayList<>();
	}
	
	public boolean addImposto(Imposto impos) throws Exception{
		
		if(impos == null) {
			throw new Exception("Imposto não pode ser nulo.");
		}
		
		if(impostos.contains(impos)) {
			return false;
		}else {
			impostos.add(impos);
		}
		
		return true;
	}
	
	private void setMargemLucro(double margemLucro) throws Exception{
		if(margemLucro <= 0) {
			throw new Exception("Margem de lucro está inválido");
		}
		this.margemLucro = margemLucro/100;
	}

	private void setPrecoCusto(double precoCusto) throws Exception{
		if(precoCusto <= 0) {
			throw new Exception("Preço de custo está inválido");
		}
		this.precoCusto = precoCusto;
	}

	private void setNome(String nome)throws Exception{
		if(nome == null | nome.equals("")) {
			throw new Exception("Nome inválido");
		}
		this.nome = nome;
	}

	public String getNome() {
        return nome;
    }
	
	public void insereImposto(Imposto imposto) {
        impostos.add(imposto);
    }
	
	public double calcPrecoVenda(){
		
		 double totalImpostos = 0;
		 
		 for(Imposto imposto : impostos) 
			 totalImpostos += imposto.calcImpost(precoCusto);
		 
		 double precoVenda = precoCusto + totalImpostos;
		 
         return  precoVenda + (precoVenda * margemLucro);
    	}
}
