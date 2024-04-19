package br.com.fiap.checkpoint2.model;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="profissionais")
public class Profissional extends AbstractEntity<Long> {

	
	
	@Column(nullable=false)
	private String nome;
	
	
    @Column(nullable=false)
	private String especialidade;
	
	
    @Column(name="valor_hora")
	private double valorHora;
	
	
	@Column(name="created_at",nullable=false)
	private LocalDate  createdAt;
	
	
	@Column(name="update_at",nullable=false)
	private LocalDate  updatedAt;
	
	public LocalDate getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
}
