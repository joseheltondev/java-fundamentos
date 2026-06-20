import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 07
 * Programa que lê N pares de números e exibe o resultado da divisão 
 * entre eles, tratando casos de divisão por zero 
 * com a mensagem "divisao impossivel".
 */

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de pares de numeros: ");
		int quantidadePares = sc.nextInt(); 
		
		for (int i = 0; i < quantidadePares; i++) {
			System.out.print("Dividendo: ");
			double dividendo = sc.nextDouble();
			System.out.print("Divisor: ");
			double divisor = sc.nextDouble();
			
			if (divisor != 0) {
				double quociente = dividendo / divisor;
				System.out.printf("Resultado = %.2f%n", quociente);
			}
			else {
				System.out.println("Divisão impossível");
			}
			System.out.println("--------------------");
		}
				
		sc.close();
	}
}
