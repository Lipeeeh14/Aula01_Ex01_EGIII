package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.models.Funcionario;
import br.com.fateczl.lipe.models.FuncionarioTempoParcial;

public class FuncionarioTempoParcialController extends FuncionarioExtensions implements FuncionarioController {
	
	@Override
	public Funcionario inicializarFuncionario() {
		FuncionarioTempoParcial funcionarioTempoParcial = new FuncionarioTempoParcial();
		funcionarioTempoParcial = (FuncionarioTempoParcial) informacoesBasicas(funcionarioTempoParcial);
		funcionarioTempoParcial.setHoraEntrada(solicitarInformacao("Hora de Entrada (hora:minuto)"));
		funcionarioTempoParcial.setHoraSaida(solicitarInformacao("Hora de Saída (hora:minuto)"));
		
		return funcionarioTempoParcial;
	}
}
