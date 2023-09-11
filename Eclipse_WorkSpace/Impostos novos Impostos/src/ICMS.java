
public class ICMS extends Imposto{
	private boolean industrializado;
	
	public ICMS(double precoCusto) {
		super(precoCusto);
		this.industrializado = industrializado;
	}

	public double calcularICMS() {
        double taxa = industrializado ? 0.05 : 0.07;
        return precoCusto * taxa;
    }
}
