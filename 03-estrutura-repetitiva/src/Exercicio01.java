import java.util.Scanner;

/*
 * Exercício 01
 * Leia dois números inteiros.
 * Enquanto forem diferentes, informe se estão em ordem
 * crescente ou decrescente.
 * O programa encerra quando os dois números forem iguais.
 */

public class Exercicio01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int x = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int y = sc.nextInt();
		
		while (x != y){
			if (x < y) {
				System.out.println("Ordem crescente!");
			}
			else {
				System.out.println("Ordem decrescente!");
			}
			
			System.out.println("---------------------");
			System.out.print("Digite o primeiro número: ");
			x = sc.nextInt();
			System.out.print("Digite o segundo número: ");
			y = sc.nextInt();
		}
		
		System.out.println("Os números são iguais!");
		sc.close();
	}
}
