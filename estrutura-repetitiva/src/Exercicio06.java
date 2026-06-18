import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 06
 * Leia a quantidade de alunos.
 * Para cada aluno, leia as notas de três testes
 * e calcule a média ponderada utilizando os
 * pesos 2, 3 e 5.
 */

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int alunos = sc.nextInt();
		
		for (int i = 0; i < alunos; i++) {
			System.out.println("Aluno " + (i + 1));
			System.out.print("1° Teste: ");
			double teste1 = sc.nextDouble();
			System.out.print("2° Teste: ");
			double teste2 = sc.nextDouble();
			System.out.print("3° Teste: ");
			double teste3 = sc.nextDouble();
			
			double media = (teste1 * 2 + teste2 * 3 + teste3 * 5) / 10;
			System.out.printf("Média = %.1f%n", media);
			System.out.println("---------------");
		}
		
		sc.close();
	}
}
