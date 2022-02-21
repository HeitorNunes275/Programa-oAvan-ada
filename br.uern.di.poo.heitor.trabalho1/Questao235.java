package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao235 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Faixa Solidária! Insira as informações abaixo.\n");
		System.out.print("Quilômetros totais dirigidos por dia: ");
		double a = input.nextDouble();
		System.out.print("Preço por litro de gasolina: ");
		double b = input.nextDouble();
		System.out.print("Quilômetros médios por dia: ");
		double c = input.nextDouble();
		System.out.print("Taxas de estacionamento por dia: ");
		double d = input.nextDouble();
		System.out.print("Pedágio por dia: ");
		double e = input.nextDouble();
		System.out.println("\nAderindo a faixa solidária, você pagará:\n");
		System.out.printf("Quilômetros totais dirigidos por dia: R$%.2f (Economia de R$%.2f)\n", a-(a*0.2), a*0.2);
		System.out.printf("Preço por litro de gasolina: R$%.2f (Economia de R$%.2f)\n", b-(b*0.2), b*0.2);
		System.out.printf("Quilômetros médios por dia: R$%.2f (Economia de R$%.2f)\n", c-(c*0.2), c*0.2);
		System.out.printf("Taxas de estacionamento por dia: R$%.2f (Economia de R$%.2f)\n", d-(d*0.2), d*0.2);
		System.out.printf("Pedágio por dia: R$%.2f (Economia de R$%.2f)", e-(e*0.2), e*0.2);
	}
}