import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 02
 * Ler raio de um círculo e calucular sua área.
 */

public class Exercicio02 {
    
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite o raio do circulo: ");
		double raio = sc.nextDouble();
		
		double pi = 3.1415;
		double area = pi * (raio * raio);
		
		System.out.printf("Area = %.2f%n", area);
		
		sc.close();
    }
}