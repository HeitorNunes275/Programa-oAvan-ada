package br.uern.di.poo.heitor.trabalho1;

public class Questao317 {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private double peso;
	private double altura;
	
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
