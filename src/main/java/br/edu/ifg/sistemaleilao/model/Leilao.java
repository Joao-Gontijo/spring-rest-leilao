package br.edu.ifg.sistemaleilao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String item;
	private String dataAbertura;
	private double lanceMinimo;
	private double lanceAtual;
	private String dataFechamento;
	private String situacao;

	
	public Leilao() {
	
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getLanceMinimo() {
		return lanceMinimo;
	}

	public void setLanceMinimo(double lanceMinimo) {
		this.lanceMinimo = lanceMinimo;
	}

	public double getLanceAtual() {
		return lanceAtual;
	}

	public void setLanceAtual(double lanceAtual) {
		this.lanceAtual = lanceAtual;
	}

	public String getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(String dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}