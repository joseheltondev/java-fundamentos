import java.util.Scanner;

/*
 * Exercício 04 
 * Ler hora inicial e final de um jogo e calcular a duração do jogo, 
 * sabendo que o jogo tem duração mínima de 1 hora e máxima de 24 horas.
 */

public class Exercicio03 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Digite a hora que o jogo começou: ");
		horaInicial = sc.nextInt(); 
		System.out.print("Digite a hora que o jogo terminou: ");
		horaFinal = sc.nextInt(); 
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		
		
		System.out.printf("O jogo durou %d hora(s)%n", duracao);
		
		sc.close();
	}
}
