import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		
		Imposto icms = new Imposto("ICMS", 0.07);
		Imposto Confins = new Imposto("Confins", 0.12);
		Imposto ipi = new Imposto("IPI", 0.08);
		Imposto iss = new Imposto("ISS", 0.05);
		Imposto cide = new Imposto("Cide", 0.10);
		Imposto csll = new Imposto("CSLL", 0.04);	
		
		List<Produto> produtos = new ArrayList<>();
		
		Produto arroz = new Produto("Arroz", 7.00, 0.20);
		arroz.insereImposto(Confins);
		arroz.insereImposto(icms);
		arroz.insereImposto(iss);
		
		Produto feijao = new Produto("Feijão", 7.00, 0.25);
		feijao.insereImposto(Confins);
		feijao.insereImposto(icms);
		feijao.insereImposto(iss);
		
		Produto carne = new Produto("Carne", 7.00, 0.35);
		carne.insereImposto(Confins);
		carne.insereImposto(icms);
		carne.insereImposto(ipi);
		
		Produto cerveja = new Produto("Cerveja", 7.00, 0.30);
		cerveja.insereImposto(Confins);
		cerveja.insereImposto(icms);
		cerveja.insereImposto(iss);
		cerveja.insereImposto(ipi);
		
		Produto gas = new Produto("Gás", 7.00, 0.15);
		gas.insereImposto(Confins);
		gas.insereImposto(icms);
		gas.insereImposto(ipi);
		
		Produto gasolina = new Produto("Gasolina", 7.00, 0.15);
		gasolina.insereImposto(Confins);
		gasolina.insereImposto(icms);
		gasolina.insereImposto(cide);
		
		produtos.add(arroz);
		produtos.add(feijao);
		produtos.add(carne);
		produtos.add(cerveja);
		produtos.add(gas);
		produtos.add(gasolina);
		
		System.out.println("Lista de Preços de Venda:\n");
        for (Produto produto : produtos) {
            double precoVenda = produto.calcPrecoVenda();
            System.out.println(produto.getNome() + ": R$" + String.format("%.2f", precoVenda));
        }
	}
	
}
