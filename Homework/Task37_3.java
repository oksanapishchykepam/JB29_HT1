package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Сумма цифр данного трехзначного числа N является четным числом. */

public class Task37_3 {

	public static void main(String[] args) {
		
		boolean value;
		int number = 231;
		int sum = 0;
		
		for (int i = 1; i <=3; i++) {
			sum = sum + number % 10;
			number = number / 10;
		}
		
		if (sum % 2 == 0) {
			value = true;
		}
		else {
			value = false;
		}
		
		System.out.println(value);
	}

}
