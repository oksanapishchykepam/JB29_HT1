package Homework;

/* Найти произведение цифр заданного четырехзначного числа. */

public class Task16 {

	public static void main(String[] args) {
		
		int number = 1234;
		int newNumber = number;
		int multi = 1;
		
		while (newNumber > 10) {
			int lastDigit = newNumber % 10;
			newNumber = newNumber / 10;
			multi = multi * lastDigit;
		}
		
		System.out.println("Произведение цифр числа " + number + " равно " + multi);
	}

}
