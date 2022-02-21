package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao317MAIN {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Questao317 a = new Questao317();
		System.out.print("Nome: ");
		a.setNome(input.nextLine());
		System.out.print("Sobrenome: ");
		a.setSobrenome(input.nextLine());
		System.out.print("Sexo: ");
		a.setSexo(input.nextLine());
		System.out.print("Data de nascimento\nDia: ");
		a.setDia(input.nextInt());
		System.out.print("Mes: ");
		a.setMes(input.nextInt());
		System.out.print("Ano: ");
		a.setAno(input.nextInt());
		System.out.print("Altura: ");
		a.setAltura(input.nextDouble());
		System.out.print("Peso: ");
		a.setPeso(input.nextDouble());
		System.out.printf("\nNome: %s\nSobrenome: %s\nData de Nascimento: %d/%d/%d\n"
				+ "Idade: %d anos\n"
				+ "Peso: %.2f\nAltura: %.2f\n", a.getNome(), a.getSobrenome(), 
				a.getDia(), a.getMes(), a.getAno(), a.idade(), a.getPeso(), a.getAltura());
		System.out.printf("Sua frequência cardíaca máxima é de %d\nSua frequência "
				+ "cardíaca alvo é %.2f\n", a.frequenciaMAX(), a.frequenciaALVO());
		System.out.printf("IMC = %.2f", (a.getPeso())/((a.getAltura())*a.getAltura()));
		System.out.println("\n------------------------");
		System.out.println("Valores Índice de Massa Corporal");
		System.out.println("Abaixo do peso: menor que 18,5");
		System.out.println("Normal: entre 18,5 e 24,9");
		System.out.println("Acima do peso: entre 25 e 29,9");
		System.out.println("Obeso(a): 30 ou mais");
		System.out.println("------------------------");

	}

}
