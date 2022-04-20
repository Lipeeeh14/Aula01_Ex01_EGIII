package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.models.Funcionario;
import br.com.fateczl.lipe.models.FuncionarioTempoIntegral;

public class FuncionarioTempoIntegralController extends FuncionarioExtensions implements FuncionarioController {
	
	@Override
	public Funcionario inicializarFuncionario() {
		FuncionarioTempoIntegral funcionarioTempoIntegral = new FuncionarioTempoIntegral();
		funcionarioTempoIntegral = (FuncionarioTempoIntegral) informacoesBasicas(funcionarioTempoIntegral);
		funcionarioTempoIntegral.setBancoHoras(Integer.parseInt(solicitarInformacao("Banco de Horas")));
		
		return funcionarioTempoIntegral;
	}
	
	
}
