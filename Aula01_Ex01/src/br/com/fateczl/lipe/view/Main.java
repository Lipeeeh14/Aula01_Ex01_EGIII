package br.com.fateczl.lipe.view;

import javax.swing.JOptionPane;

import br.com.fateczl.lipe.controller.EstagiarioController;
import br.com.fateczl.lipe.controller.FuncionarioTempoIntegralController;
import br.com.fateczl.lipe.controller.FuncionarioTempoParcialController;
import br.com.fateczl.lipe.controller.FuncionarioTemporarioController;

public class Main {

	public static void main(String[] args) {
		try {
			menu();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro!!!");
			System.out.println(e.getMessage());
		}	
	}
	
	private static void menu() {
		EstagiarioController eController = new EstagiarioController();
		FuncionarioTempoIntegralController tempoIntegralController = new FuncionarioTempoIntegralController();
		FuncionarioTempoParcialController tempoParcialController = new FuncionarioTempoParcialController();
		FuncionarioTemporarioController temporarioController = new FuncionarioTemporarioController();
		int opcao;
		boolean loop = true;
		while(loop) {			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
		    		"Escolha uma das opções abaixo:\n" +
		    		"1 - Contratar Funcionário Integral\n" + 
		    		"2 - Contratar Funcionário de Tempo Parcial\n" + 
		    		"3 - Contratar Funcionário Temporário\n" + 
		    		"4 - Contratar Estagiário\n" +
		    		"5 - Sair"
		    		));
		    
		    switch (opcao) {
				case 1: tempoIntegralController.inicializarFuncionario(); 
				break;
				case 2: tempoParcialController.inicializarFuncionario();
				break;
				case 3: temporarioController.inicializarFuncionario();
				break;
				case 4: eController.inicializarFuncionario();
				break;
				case 5:
					JOptionPane.showMessageDialog(null, "Até a próxima!");
					loop = false;
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente");
			}
		}
	}
}
