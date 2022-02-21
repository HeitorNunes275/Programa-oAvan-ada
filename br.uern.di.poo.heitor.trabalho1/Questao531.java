package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao531 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int acertos = 0;
		System.out.printf("Questionário sobre o Aquecimento Global!\n\n");
		System.out.println("01 - O aquecimento é consequência da intensificação de qual fenômeno natural do planeta?");
		System.out.println("1) Destruição da camada de ozônio");
		System.out.println("2) Chuva ácida");
		System.out.println("3) Efeito estufa");
		System.out.println("4) Eutrofização");
		int q = input.nextInt();
		if (q == 3) {
			acertos++;
		}
		System.out.println("\n02 - Cientistas acreditam que o reflorestamento e o plantio de árvores em áreas sem vegetação podem "
				+ "contribuir para minimizar o aquecimento global. "
				+ "A redução desse aquecimento ocorreria porque:");
		System.out.println("1) diminuiria a quantidade de dióxido de carbono na atmosfera, "
				+ "que seria utilizado pela fotossíntese.");
		System.out.println("2) diminuiria o efeito estufa, com a liberação de gás carbônico, "
				+ "em decorrência da expansão da cobertura vegetal.");
		System.out.println("3) a expansão das florestas seria inibida, em longo prazo, "
				+ "pelo excesso de gás carbônico liberado.");
		System.out.println("4) aumentaria a quantidade de dióxido de carbono na atmosfera, "
				+ "liberado pela respiração celular.");
		q = input.nextInt();
		if (q == 1) {
			acertos++;
		}
		System.out.println("\n03 - O excesso de gás carbônico produzido por atividades humanas pode:");
		System.out.println("1) intensificar a eutrofização nos oceanos e diminuir a taxa de gás oxigênio dissolvido na água. "
				+ "Isso provoca a morte dos corais.");
		System.out.println("2) aumentar a temperatura da água e, com isso, as células do animal começam a se desintegrar e "
				+ "não conseguem manter o esqueleto de fosfato de cálcio resistente.");
		System.out.println("3) reagir com gases sulfídricos e formar a chuva ácida. "
				+ "A mudança no pH da água provoca a destruição dos endoesqueletos dos corais.");
		System.out.println("4) ser absorvido pelos oceanos e formar o ácido carbônico, que pode dissolver o esqueleto dos corais. "
				+ "Isso ocasionará a perda da sustentação do animal.");
		q = input.nextInt();
		if (q == 4) {
			acertos++;
		}
		System.out.println("\n04 - Quanto ao efeito estufa, está INCORRETO o que se afirma em:");
		System.out.println("1) Sua concentração na atmosfera impossibilita que o calor seja irradiado, aquecendo a superfície terrestre, "
				+ "elevando as temperaturas.");
		System.out.println("2) O uso de energias renováveis é uma das atividades que "
				+ "mais produzem gases de efeito estufa.");
		System.out.println("3) É um fenômeno atmosférico.");
		System.out.println("4) O gás metano é o segundo maior contribuinte para o aumento das temperaturas da Terra.");
		q = input.nextInt();
		if (q == 2) {
			acertos++;
		}
		System.out.println("\n05 - Assinale a opção que define corretamente o fenômeno do Aquecimento Global:");
		System.out.println("1) O Aquecimento Global corresponde a uma área onde há muitos terremotos e uma forte atividade vulcânica, "
				+ "localizado no Norte do Oceano Pacífico.");
		System.out.println("2) O Aquecimento Global é o processo de derretimento das geleiras do Ártico "
				+ "e da Antártida que acabam por elevar o nível dos oceanos.");
		System.out.println("3) O Aquecimento Global corresponde ao aumento da temperatura média do planeta Terra, "
				+ "causado pelo acúmulo de gases poluentes na atmosfera.");
		
		System.out.println("4)  O Aquecimento Global corresponde à cobertura de gás ozônio presente na atmosfera terrestre que "
				+ "protege o planeta das radiações ultravioletas prejudiciais aos seres vivos.");
		q = input.nextInt();
		if (q == 3) {
			acertos++;
		}
		if (acertos == 5) {
			System.out.println("Excelente!");
		}
		if (acertos == 4) {
			System.out.println("Muito bom!");
		}
		if (acertos <= 3) {
			System.out.println("É o momento de aprimorar seu conhecimento sobre o Aquecimento Global!");
		}
		System.out.println("\nFontes:\nhttps://www.questoesestrategicas.com.br/questoes/busca/assunto/aquecimento-global1\n"
				+ "https://exercicios.mundoeducacao.uol.com.br/exercicios-biologia/exercicios-sobre-aquecimento-global-biodiversidade.htm");
	}
}