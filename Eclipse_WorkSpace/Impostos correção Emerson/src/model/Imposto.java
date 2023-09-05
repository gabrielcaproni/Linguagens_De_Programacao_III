package model;

public class Imposto {
	
	private String abbr;
	private String nome;
	private double taxa;
	
	public Imposto(String abbr, String nome, double taxa){
		this.abbr = abbr;
		this.nome = nome;
		setTaxa(taxa);
	}
	
	public double calcImpost(double valorBase){
		return valorBase * taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa/100;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Imposto)) {
			return false;
		}
		
		//Cast (Imposto)obj
		Imposto impos = (Imposto)obj;
		
		return this.abbr.equals(impos.abbr);
	}
}

