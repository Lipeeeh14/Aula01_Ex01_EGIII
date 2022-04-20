package br.com.fateczl.lipe.models;

import java.util.Random;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	private Random gerarId = new Random();
	
	public Funcionario() {
		this.id = gerarId.nextInt(1000) + 1;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
