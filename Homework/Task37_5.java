package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. */

import static java.lang.Math.*;

public class Task37_5 {

	public static void main(String[] args) {

		boolean value;
		int number = 124;
		
		int numberSquare = (int)pow(number, 2);
		int sum = 0;
		
		for (int i = 1; i <=3; i++) {
			sum = sum + number % 10;
			number = number / 10;
		}
		
		int sumCube = (int)pow(sum, 3);
		
		if (numberSquare == sumCube) {
			value = true;
		}
		else {
			value = false;
		}
		
		System.out.println(value);

	}

}
