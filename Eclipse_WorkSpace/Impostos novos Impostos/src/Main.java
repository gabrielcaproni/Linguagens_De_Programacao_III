import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		
		double precoCustoICMS = 100.0;
        double precoCustoIPI = 150.0;
        double precoCustoISS = 200.0;
        double margemLucroISS = 50.0;

        ICMS icmsProduto = new ICMS(precoCustoICMS);
        IPI ipiProduto = new IPI(precoCustoIPI, true);
        ISS issServico = new ISS(precoCustoISS, margemLucroISS);
        
        double valorICMS = icmsProduto.calcularICMS();
        double valorIPI = ipiProduto.calcularIPI();
        double valorISS = issServico.calcularISS();

        System.out.println("ICMS: R$" + valorICMS);
        System.out.println("IPI: R$" + valorIPI);
        System.out.println("ISS: R$" + valorISS);
	}
	
}
