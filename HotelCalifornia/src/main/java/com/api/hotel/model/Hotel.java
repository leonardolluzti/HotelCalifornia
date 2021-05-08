package com.api.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "matricula", nullable = false)
	private int matricula;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "valordiaria", nullable = true)
	private float valordiaria;
	@Column(name = "cidade", nullable = true)
	private String cidade;
	@Column(name = "estrelas", nullable = true)
	private float estrelas;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValordiaria() {
		return valordiaria;
	}
	public void setValordiaria(float valordiaria) {
		this.valordiaria = valordiaria;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public float getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(float estrelas) {
		this.estrelas = estrelas;
	}
	@Override
	public String toString() {
		return "Hotel [matricula=" + matricula + ", nome=" + nome + ", valordiaria=" + valordiaria + ", cidade="
				+ cidade + ", estrelas=" + estrelas + "]";
	}
	
	

}
