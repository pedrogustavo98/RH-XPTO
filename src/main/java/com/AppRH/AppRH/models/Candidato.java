package com.AppRH.AppRH.models;


//import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


@Entity
public class Candidato {
	
	//Calendar cal = Calendar.getInstance();
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String cpf;
	
	@NotEmpty
	private String nomeCandidato;
	
	@NotEmpty
	private String sobrenome;
	
	@NotEmpty
	public String dataNascimento;
	

	//@NotEmpty
	private boolean maiorIdade;
	
	//@NotEmpty
	private int idade;
	
	
	//@NotEmpty
	//int atualYear = cal.get(Calendar.YEAR);
    //int year = cal.get(Calendar.YEAR);		
	//int idade = atualYear - year;
			
			
	@ManyToOne
	private Vaga vaga;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}
	
	
	public String getDataNascimento() {
	return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public boolean isMaiorIdade() {
		return maiorIdade;
	}

	public void setMaiorIdade(boolean maiorIdade) {
		this.maiorIdade = maiorIdade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
