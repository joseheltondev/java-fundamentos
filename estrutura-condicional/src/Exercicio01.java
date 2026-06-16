import java.util.Scanner;

/*
 * Exercício 01
 * Ler um número inteiro e dizer se é par ou impar.
 */


public class Exercicio01 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva um número inteiro: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("O número é PAR!");
		}
		else {
			System.out.println("O número é IMPAR!");
		}
		
		sc.close();
	}
}
