package br.com.fateczl.lipe.controller;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.models.Funcionario;

abstract class FuncionarioExtensions {
	
	protected String solicitarInformacao(String solicitacao) {
		return JOptionPane.showInputDialog(solicitacao + " do funcionário: ");
	}
	
	protected Funcionario informacoesBasicas(Funcionario funcionario) {
		funcionario.setNome(solicitarInformacao("Nome"));
		funcionario.setSalario(Double.parseDouble(solicitarInformacao("Salario")));
		
		return funcionario;
	}
}
