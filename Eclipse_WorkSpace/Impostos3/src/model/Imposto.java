package model;

public abstract class Imposto {
	
	private String abbr;
	private String nome;
	private double taxa;
	
	public Imposto(String abbr, String nome){
		this.abbr = abbr;
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Imposto)) {
			return false;
		}
		
		Imposto impos = (Imposto)obj;
		
		return this.abbr.equals(impos.abbr);
	}
	
	protected void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	protected abstract double calculate(Produto p);
}

