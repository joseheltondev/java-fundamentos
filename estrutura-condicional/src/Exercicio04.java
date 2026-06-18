
import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 04
 * Ler um valor qualquer e dizer em qual dos seguintes intervalos 
 * ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
 */

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("O número está no intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("O número está no intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("O número está no intervalo (50,75]");
		}		
		else {
			System.out.println("O número está no intervalo (75,100]");
		}

		sc.close();
	}
}