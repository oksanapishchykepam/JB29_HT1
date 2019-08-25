package Homework;

/* Найти частное произведений четных и нечетных цифр четырехзначного числа. */

public class Task36 {

	public static void main(String[] args) {
		int number = 4321;
		
		int evenNumbers = 1;
		int oddNumbers = 1;
		
		for (int i = 1; i <= 4; i++) {
			int lastDigit = number % 10;
			
			if (lastDigit % 2 == 0) {
				evenNumbers = evenNumbers * lastDigit;
			}
			
			else {
				oddNumbers = oddNumbers * lastDigit;
			}
			
			number = number / 10;
		}
		
		System.out.println("Произведение четных чисел числа равно " + evenNumbers);
		System.out.println("Произведение  нечетных чисел числа равно " + oddNumbers);

	}

}
