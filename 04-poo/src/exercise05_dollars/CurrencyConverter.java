package exercise05_dollars;

public class CurrencyConverter {
	
	public static final double TAX = 1.06;
	
	public static double converter(double dollarPrice, double dollars) {
		return dollarPrice * dollars * TAX;
	} 
	
}
