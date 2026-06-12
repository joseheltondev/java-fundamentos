import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 04
 * Ler os dados de duas peças (quantidade e valor unitário), 
 * e exibir o valor a ser pago.
 */

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preco do 1 produto: ");
		double preco1 = sc.nextDouble(); 
		System.out.print("Digite sua quantidade: ");
		int quant1 = sc.nextInt();
		System.out.print("Digite o preco do 2 produto: ");
		double preco2 = sc.nextDouble(); 
		System.out.print("Digite sua quantidade: ");
		int quant2 = sc.nextInt();
		
		double precoTotal = preco1 * quant1 + preco2 * quant2;
		System.out.printf("Valor total a pagar = R$ %.2f%n", precoTotal);
		
		sc.close();
	}
}
