package exercise01_products;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício 01 - Produto em Estoque
 *
 * Criar uma classe Product contendo:
 * - nome
 * - preço
 * - quantidade em estoque
 *
 * Implementar métodos para adicionar e remover produtos do estoque
 * e calcular o valor total em estoque.
 *
 * No programa principal, ler os dados do produto, realizar operações
 * de entrada e saída de estoque e exibir os dados atualizados.
 */

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		product.addProducts(add);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		System.out.println();
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}