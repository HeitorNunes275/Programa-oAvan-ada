package br.uern.di.poo.heitor.trabalho1;

public class Questao439 {

	public static void main(String[] args) {
		double a = 7.8;
		System.out.println("Ano	População mundial esperada	Aumento numérico na população mundial");
		for (int i = 1; i < 75; i++) {
			System.out.printf("%d		%.2f bilhões		Aproximadamente %.2f bilhões\n",i,a,a*0.009);
			a = a+(a*0.009);
		}
		System.out.printf("\nPopulação dobraria entre o ano 78 e 79.");
	}

}

//Fonte: https://www.istoedinheiro.com.br/populacao-mundial-aumentou-74-milhoes-este-ano/
//Parti da premissa que o Ano 1 tem 7,8 bilhões de pessoas com um crescimento anual de 0,9%