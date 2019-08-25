package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. */

public class Task37_7 {

	public static void main(String[] args) {
		
		boolean value;
		int number = 235;
		
		int digit1 = number % 10;
		number = number / 10;
		int digit2 = number % 10;
		number = number / 10;
		int digit3 = number;
		
		int sum12 = digit1 + digit2;
		int sum23 = digit2 + digit3;
		int sum13 = digit1 + digit3;
		
		if (sum12 == digit3 || sum23 == digit1 || sum13 == digit2) {
			value = true;
		}
		else {
			value = false;
		}
		
		
		System.out.println(value);
	}

}
