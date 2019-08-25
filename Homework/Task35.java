package Homework;

/* Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. */

public class Task35 {

	public static void main(String[] args) {
		int number1 = 45234;
		int number2 = 16;
		
		double quotient = (double)number1 / number2;
		
		int quotientInt = (int)quotient;
		double quotientDecimal = quotient - quotientInt;

		int lastNumberOfInt = quotientInt % 10;
		double newQuotientDecimal = quotientDecimal * 10;
		int firstNumberOfDecimal = (int)newQuotientDecimal;
		
		
		System.out.println(quotient);
		System.out.println(quotientInt);
		System.out.println(quotientDecimal);
		System.out.println("Старшая цифра дробной части равна " + lastNumberOfInt);
		System.out.println("Младшая цифра целой части равна " + firstNumberOfDecimal);
		
	}

}
