package view;

import model.Imposto;
import model.Produto;

public class Main{

	public static void main(String[] args) throws Exception{
		Produto arroz = new Produto("Arroz pileco", 100, 30);
		
		Imposto ipi = new Imposto("IPI", "Imposto Prod. Industrializado", 8);
		Imposto iss = new Imposto("ISS", "Imposto Sobre Serviço", 12);
		
		arroz.addImposto(ipi);
		arroz.addImposto(iss);
		
		System.out.println(arroz.getNome() + (" R$: ") + arroz.calcPrecoVenda());
	}
}
