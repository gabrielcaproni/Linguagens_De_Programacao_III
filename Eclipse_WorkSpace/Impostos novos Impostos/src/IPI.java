
public class IPI extends Imposto{
	private boolean nacional;
	
	public IPI(double precoCusto, boolean nacional) {
		super(precoCusto);
		this.nacional = nacional;
	}
	
	public double calcularIPI() {
        double taxa = nacional ? 0.08 : 0.10;
        return precoCusto * taxa;
    }
}
