package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.models.Estagiario;
import br.com.fateczl.lipe.models.Funcionario;

public class EstagiarioController extends FuncionarioExtensions implements FuncionarioController {

	@Override
	public Funcionario inicializarFuncionario() {
		Estagiario estagiario = new Estagiario();
		estagiario = (Estagiario) informacoesBasicas(estagiario);
		estagiario.setHoraEntrada(solicitarInformacao("Hora de Entrada (hora:minuto)"));
		estagiario.setHoraSaida(solicitarInformacao("Hora de Saída (hora:minuto)"));
		estagiario.setInstituicaoParceira(solicitarInformacao("Intituição Parceira"));
		
		return estagiario;
	}
	
}
