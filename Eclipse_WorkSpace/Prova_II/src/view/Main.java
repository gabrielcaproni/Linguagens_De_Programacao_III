package view;

import java.util.ArrayList;
import java.util.List;

import model.Analista;
import model.Arquiteto;
import model.Funcionario;
import model.Gerente;
import model.LiderTecnico;

public class Main {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario("Gabriel", "Analista", 12.000);
		List<Funcionario> func1 = new ArrayList<>();

		Analista an = new Analista();
		Arquiteto ar = new Arquiteto();
		Gerente ge = new Gerente();
		LiderTecnico lt = new LiderTecnico();
		
		System.out.println(an);
		System.out.println(ar);
		System.out.println(ge);
		System.out.println(lt);
	}

}
