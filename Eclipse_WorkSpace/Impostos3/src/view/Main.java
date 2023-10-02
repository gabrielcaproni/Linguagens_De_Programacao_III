package view;

import model.Imposto;
import model.Produto;

public class Main{

	public static void main(String[] args) throws Exception{
		Produto arroz = new Produto("Arroz pileco", 100, 30);
		
		Imposto ipi = new IPI();
		
		arroz.addImposto(ipi);
		
		System.out.println(arroz.getNome() + (" R$: ") + arroz.calcPrecoVenda());
	}
}
