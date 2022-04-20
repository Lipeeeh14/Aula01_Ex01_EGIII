package br.com.fateczl.lipe.controller;

import br.com.fateczl.lipe.models.Funcionario;
import br.com.fateczl.lipe.models.FuncionarioTemporario;

public class FuncionarioTemporarioController extends FuncionarioExtensions implements FuncionarioController {
	@Override
	public Funcionario inicializarFuncionario() {
		FuncionarioTemporario funcionarioTemporario = new FuncionarioTemporario();
		funcionarioTemporario = (FuncionarioTemporario) informacoesBasicas(funcionarioTemporario);
		
		String[] data = solicitarInformacao("Data de término de contrato do funcionário (dia/mes/ano)").split("/");
		funcionarioTemporario.setDia(Integer.parseInt(data[0]));
		funcionarioTemporario.setMes(Integer.parseInt(data[1]));
		funcionarioTemporario.setAno(Integer.parseInt(data[2]));
		
		return funcionarioTemporario;
	}
}
