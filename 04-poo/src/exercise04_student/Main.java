package exercise04_student;

import java.util.Locale;
import java.util.Scanner;

/*
* Exercício 04
* Ler o nome de um aluno e suas três notas.
* Calcular a nota final e informar se o aluno foi aprovado.
* Caso reprovado, mostrar quantos pontos faltaram para atingir 60.00.
*/

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stud = new Student();
		
		System.out.print("Name: ");
		stud.name = sc.nextLine();
		
		System.out.print("1° grade: ");
		stud.grade1 = sc.nextDouble();
		System.out.print("2° grade: ");
		stud.grade2 = sc.nextDouble();
		System.out.print("3° grade: ");
		stud.grade3 = sc.nextDouble();
		
		System.out.println(stud);
		
		sc.close();
	}
}
