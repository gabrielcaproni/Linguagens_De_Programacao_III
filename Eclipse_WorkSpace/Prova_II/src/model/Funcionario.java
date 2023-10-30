package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario{
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	List<Funcionario> func = new ArrayList<>();
}
