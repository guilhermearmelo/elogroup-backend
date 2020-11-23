package com.example.elogroup.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_LEAD")
public class Lead {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private String telefone;
	
	private String email;
	
	private int status;
	
	private boolean opRPA;
	
	private boolean opProdDigital;
	
	private boolean opAnalytics;
	
	private boolean opBPM;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isOpRPA() {
		return opRPA;
	}

	public void setOpRPA(boolean opRPA) {
		this.opRPA = opRPA;
	}

	public boolean isOpProdDigital() {
		return opProdDigital;
	}

	public void setOpProdDigital(boolean opProdDigital) {
		this.opProdDigital = opProdDigital;
	}

	public boolean isOpAnalytics() {
		return opAnalytics;
	}

	public void setOpAnalytics(boolean opAnalytics) {
		this.opAnalytics = opAnalytics;
	}

	public boolean isOpBPM() {
		return opBPM;
	}

	public void setOpBPM(boolean opBPM) {
		this.opBPM = opBPM;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
