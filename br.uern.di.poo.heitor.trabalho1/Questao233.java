package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao233 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 1 para para ler o peso em libras e a altura em polegadas:");
		System.out.println("Digite 2 para para ler o peso em quilogramas e a altura em metros:");
		int a = input.nextInt();
		if (a==1) {
			System.out.print("Digite o peso em libras: ");
			double libras = input.nextDouble();
			System.out.print("Digite a altura em polegadas: ");
			double polegadas = input.nextDouble();
			System.out.printf("IMC = %.2f", (libras*703)/(polegadas*polegadas));
		}
		else {
			System.out.print("Digite o peso em quilogramas: ");
			double quilo = input.nextDouble();
			System.out.print("Digite a altura em metros: ");
			double metro = input.nextDouble();
			System.out.printf("IMC = %.2f", (quilo)/(metro*metro));
		}
		System.out.println("\n------------------------");
		System.out.println("Valores Índice de Massa Corporal");
		System.out.println("Abaixo do peso: menor que 18,5");
		System.out.println("Normal: entre 18,5 e 24,9");
		System.out.println("Acima do peso: entre 25 e 29,9");
		System.out.println("Obeso(a): 30 ou mais");
		System.out.println("------------------------");
	}

}
