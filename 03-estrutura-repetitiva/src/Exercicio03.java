import java.util.Scanner;

/*
 * Exercício 03
 * Leia uma senha e repita a leitura até que
 * a senha 2002 seja informada.
 */

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida!");
			System.out.print("Tente novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}
}
