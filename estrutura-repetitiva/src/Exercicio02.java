import java.util.Scanner;

/*
 * Exercício 02
 * Leia pares de coordenadas (X, Y).
 * Para cada ponto, informe em qual quadrante ele está.
 * O programa termina quando uma das coordenadas for zero.
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("X = ");
		int x = sc.nextInt();
		System.out.print("Y = ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante!");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante!");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante!");
			}
			else {
				System.out.println("Quarto quadrante!");
			}
			System.out.println("------------------------");
			System.out.print("X = ");
			x = sc.nextInt();
			System.out.print("Y = ");
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
