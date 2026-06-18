import java.util.Scanner;

/*
 * Exercício 04
 * Leia um número inteiro X.
 * Exiba todos os números ímpares de 1 até X.
 */

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o último número: ");
		int x = sc.nextInt();
		System.out.println("----------");
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
			
		sc.close();
	}
}
