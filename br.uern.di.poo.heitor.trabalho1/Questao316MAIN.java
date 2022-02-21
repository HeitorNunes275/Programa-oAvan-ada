package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao316MAIN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Questao316 a = new Questao316();
		System.out.print("Nome: ");
		a.setNome(input.nextLine());
		System.out.print("Sobrenome: ");
		a.setSobrenome(input.nextLine());
		System.out.print("Data de nascimento\nDia: ");
		a.setDia(input.nextInt());
		System.out.print("Mes: ");
		a.setMes(input.nextInt());
		System.out.print("Ano: ");
		a.setAno(input.nextInt());
		System.out.printf("\nNome: %s\nSobrenome: %s\nData de Nascimento: %d/%d/%d\n"
				+ "Idade: %d anos\n", a.getNome(), a.getSobrenome(), a.getDia(), a.getMes(), a.getAno(), a.idade());
		System.out.printf("Sua frequência cardíaca máxima é de %d\nSua frequência "
				+ "cardíaca alvo é %.2f", a.frequenciaMAX(), a.frequenciaALVO());
		
		
	}

}
