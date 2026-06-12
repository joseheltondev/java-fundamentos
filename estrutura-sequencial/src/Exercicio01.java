import java.util.Scanner;

/*
 * Exercício 01
 * Ler largura, comprimento e o preço do metro quadrado de um terreno retangular 
 * e calcular a área e o preço do terreno.
 */

public class Exercicio01 {
    
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	System.out.print("Digite o valor da largura do terreno: ");
    	double largura = sc.nextDouble();
    	System.out.print("Digite o valor do comprimento do terreno: ");
    	double comprimento = sc.nextDouble(); 	
    	System.out.print("Digite o preco do metro quadrado: ");
    	double precoM2 = sc.nextDouble();
    	
    	double area = largura * comprimento;
    	double precoTerreno = precoM2 * area;
    	
    	System.out.printf("Area do terreno: %.2f m²%n", area);
    	System.out.printf("Preco do terreno: %.2f Reais%n", precoTerreno);

    	sc.close();
    }
}