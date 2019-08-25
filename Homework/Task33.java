package Homework;

/* Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. */

public class Task33 {

	public static void main(String[] args) {
		char randomSymbol = 'b';
		int symbolNumber = randomSymbol;
		
		int previousSymbolNumber = symbolNumber - 1;
		int nextSymbolNumber = symbolNumber + 1;
		
		char previousSymbol = (char)previousSymbolNumber;
		char nextSymbol = (char)nextSymbolNumber;
		
		System.out.println("Порядковый номер символа " + randomSymbol + " равен " + symbolNumber);
		System.out.println("Последующий за символом " + randomSymbol + " символ " + nextSymbol);
		System.out.println("Предыдущий для символа " + randomSymbol + " символ " + previousSymbol);

	}

}
