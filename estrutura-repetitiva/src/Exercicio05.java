import java.util.Scanner;

/*
 * Exercício 05
 * Leia um valor N, representando a quantidade de números a serem lidos.
 * Conte quantos valores estão entre 10 e 20 (inclusive)
 * e quantos estão fora desse intervalo.
 */

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de números a serem lidos: ");
		int n = sc.nextInt();
		
		int dentro = 0, fora = 0;
		for (int i = 0; i < n; i++) {
			int numeros = sc.nextInt();
			if (numeros >= 10 && numeros <= 20) {
				dentro ++;
			}
			else {
				fora ++;
			}	
		}		
		
		System.out.println(dentro + " Dentro");
		System.out.println(fora + " Fora");
		
		sc.close();
	}
}
