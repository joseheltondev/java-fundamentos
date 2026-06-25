package exercise02_rectangle;

import java.util.Locale;
import java.util.Scanner;

/*
* Exercício 02
* Ler a largura e a altura de um retângulo.
* Calcular e exibir sua área, perímetro e diagonal.
*/

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter the width of the rectangle: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Enter the height of the rectangle: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}
}