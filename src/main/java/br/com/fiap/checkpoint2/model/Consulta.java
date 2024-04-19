package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="consultas")
public class Consulta extends AbstractEntity<Long>{
	
	
	
	@ManyToOne
	@JoinColumn(name="profissional_id",nullable=false)
	private Profissional profissional;
	
	@ManyToOne
	@JoinColumn(name="paciente_id", nullable=false)
	private Paciente paciente;
	
	@Column(name ="data_consulta", nullable=false)
	private  LocalDate  dataConsulta;
	
	@Column(name="status_consulta",nullable=false)
	@Enumerated(EnumType.STRING)
	private StatusConsulta statusConsulta;
	
	@Column(name="quantidade_horas")
	private double quantidadeHoras;
	
	@Column(name="valor_consulta")
	private double valorConsulta;
	
	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDate getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public StatusConsulta getStatusConsulta() {
		return statusConsulta;
	}

	public void setStatusConsulta(StatusConsulta statusConsulta) {
		this.statusConsulta = statusConsulta;
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

}
