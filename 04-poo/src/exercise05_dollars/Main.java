package exercise05_dollars;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 05 - Conversor de Moedas
 * Leia a cotação do dólar e a quantidade de dólares a serem comprados.
 * Em seguida, calcule o valor total a ser pago em reais,
 * considerando uma taxa de 6% sobre a operação.
 */

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double reais = CurrencyConverter.converter(dollarPrice, dollars);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", reais);
		
		sc.close();
	}
}
