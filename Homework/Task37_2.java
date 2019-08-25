package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. */

public class Task37_2 {

	public static void main(String[] args) {
		
		int number = 3281;
		boolean value;
		
		int sum12 = 0;
		int sum34 = 0;
		
		for (int i = 1; i <= 4; i++) {
			if (i < 3) {
				sum34 = sum34 + (number % 10);
			}
			
			else {
				sum12 = sum12 + (number % 10);
			}
			
			number = number / 10;
		}

		if (sum12 == sum34) {
			value = true;
		}
		else {
			value = false;
		}
		
		System.out.println(value);
		
	}

}
