
public class Imposto {
	
	private String nome;
	private double taxa;
	
	public Imposto(String nome, double taxa){
		this.nome = nome;
		this.taxa = taxa;
	}
	
	public double calcImpost(double valorBase){
		return valorBase * taxa;
	}
}

