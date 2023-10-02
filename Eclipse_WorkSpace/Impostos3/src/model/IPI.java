package model;

public class IPI extends Imposto{
	private static final double FOREIGN_ALIQUOT = 10;
	private static final double LOCAL_ALIQUOT = 8;
	
	public IPI() {
		super("IPI", "Imposto sobre produtos industrializados");
	}

	@Override
	public void defineAliquot(Produto p) {
		if(p.isForeign())
			setAliquot(FOREIGN_ALIQUOT);
		else
			setAliquot(LOCAL_ALIQUOT);
	}

	@Override
	public double calculate(Product p) {
		double ipiCost = p.getCostPrice() * getAliquot();
		return ipicost;
	}
}
