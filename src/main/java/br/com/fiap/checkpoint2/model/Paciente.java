package br.com.fiap.checkpoint2.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="pacientes")
public class Paciente extends AbstractEntity<Long> {
	
	
	
	@Column(nullable=false)
	private String nome;

	@Column
	private String endereco;

	@Column
	private String bairro;
	
	@Column
	private String email;

	@Column(name ="telefone_completo")
	private String telefoneCompleto;
	
	@Column(name ="data_nascimento", nullable=false)
	private Date dataNascimento;
	
	@Column(name ="created_at", nullable=false)
	private LocalDate createdAt;

	@Column(name ="updated_at", nullable=false)
	private LocalDate updateAt;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefoneCompleto() {
		return telefoneCompleto;
	}

	public void setTelefoneCompleto(String telefoneCompleto) {
		this.telefoneCompleto = telefoneCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
}