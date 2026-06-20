import java.util.Scanner;

/*
 * Exercício 08 
 * Programa que lê um número inteiro N e calcula o seu fatorial. 
 * O fatorial é obtido pela multiplicação de todos os números 
 * inteiros positivos de N até 1. 
 * Por definição, 0! = 1.
 */


public class Exercicio08 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatorial: ");
		int numero = sc.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		
		System.out.printf("%d! = %d", numero, fatorial);
		
		sc.close();
	}
}