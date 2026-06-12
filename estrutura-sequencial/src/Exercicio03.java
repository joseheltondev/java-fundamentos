import java.util.Scanner;

/* 
 * Exercício 03
 * Ler quatro valores inteiros e calucular a diferença
 * do produto de A e B pelo produto de C e D.
 */

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva valore para A B C D");
		System.out.print("A = ");
		int a = sc.nextInt();
		
		System.out.print("B = ");
		int b = sc.nextInt();
		
		System.out.print("C = ");
		int c = sc.nextInt();
		
		System.out.print("D = ");
		int d = sc.nextInt();
		
		int diferenca = (a * b) - (c * d);
		System.out.printf("Diferenca = %d%n", diferenca);
		
		sc.close();	
	}
}
