import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 05
 * Ler o salário de uma pessoa e calcular o valor do imposto de renda
 * de acordo com as faixas de tributação:
 * 
 * Até R$ 2000.00 -> Isento
 * De R$ 2000.01 até R$ 3000.00 -> 8%
 * De R$ 3000.01 até R$ 4500.00 -> 18%
 * Acima de R$ 4500.00 -> 28%
 * 
 * O imposto é calculado de forma progressiva, aplicando cada taxa
 * apenas sobre a parcela do salário correspondente à sua faixa.
 */

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua renda: ");
		double renda = sc.nextDouble();
		
		double impostoRenda;
		if (renda <= 2000) {
			impostoRenda = 0;
		}
		else if (renda <= 3000) {
			impostoRenda = (renda - 2000) * 0.08;
		}
		else if (renda <= 4500) {
			impostoRenda = (1000 * 0.08) + (renda - 3000) * 0.18;
		}
		else {
			impostoRenda = (1000 * 0.08) + (1500 * 0.18) + (renda - 4500) * 0.28;
		}
		
		//Imprimindo o resultado
		if (impostoRenda == 0) {
		    System.out.println("Isento");
		}
		else {
		    System.out.printf("Imposto: R$ %.2f%n", impostoRenda);
		}

		
		sc.close();
	}
}
