import java.util.Scanner;

/*
 * Exercício 02
 * Ler dois valores inteiros e indicar se são multiplos. 
 */

public class Exercicio02 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o 1° número: ");
		int a = sc.nextInt();
		System.out.print("Escreva o 2° número: ");
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos!");
		}
		else {
			System.out.println("Não são Multiplos!");
		}
		
		sc.close();
	}
}
