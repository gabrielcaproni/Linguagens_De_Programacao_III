
public class ISS extends Imposto{
	private double margemLucro;
	
	public ISS(double precoCusto, double margemLucro) {
		super(precoCusto);
		this.margemLucro = margemLucro;
	}
	
	public double calcularISS() {
        double precoVenda = precoCusto + margemLucro;
        double taxa = 0.05;
        return precoVenda * taxa;
    }
}
