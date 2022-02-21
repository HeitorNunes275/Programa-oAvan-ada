package br.uern.di.poo.heitor.trabalho1;

public class Questao316 {
	
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	public int idade() {
		if (mes == 01) {
			ano = 2022 - ano;
		}
		if (mes == 02) {
			if (dia <= 20) {
				ano = 2022 - ano;
			}
			else {
				ano = 2021 - ano;
			}
		}
		if (mes > 02) {
			ano = 2021 - ano;
		}
		return ano;
	}
	
	public int frequenciaMAX() {
		return 220 - ano;
	}
	
	public double frequenciaALVO() {
		return frequenciaMAX() * 0.5;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}