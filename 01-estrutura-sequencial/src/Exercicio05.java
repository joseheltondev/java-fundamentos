import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 05
 * Ler 3 valores e calcular as áreas de:
 * triângulo retângulo, círculo, trapézio, quadrado e retângulo.
 */

public class Exercicio05 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 valores:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double areaTriangulo = a * c / 2.0;
		double areaCirculo = 3.14159 * c * c;
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("Area do triangulo: %.3f%n", areaTriangulo);
		System.out.printf("Area do circulo: %.3f%n", areaCirculo);
		System.out.printf("Area do trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Area do quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Area do retangulo: %.3f%n", areaRetangulo);
		
		sc.close();
	}
}
