package br.com.fateczl.lipe.models;

public class FuncionarioTempoParcial extends Funcionario {
	
	private String horaEntrada;
	private String horaSaida;

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	
}
