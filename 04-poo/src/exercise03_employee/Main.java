package exercise03_employee;

import java.util.Locale;
import java.util.Scanner;

/*
* Exercício 03
* Ler os dados de um funcionário.
* Exibir o salário líquido e aplicar um aumento percentual.
* Mostrar os dados atualizados após o reajuste.
*/

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Enter the name: ");
		employee.name = sc.nextLine();
		System.out.print("Enter the gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Enter the tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}