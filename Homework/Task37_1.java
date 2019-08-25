package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Целое число N является четным двузначным числом*/
import static java.lang.Math.*;

public class Task37_1 {

	public static void main(String[] args) {
		
		boolean value;
		
		int number = 122;
		number = abs(number);
		
		if (number % 2 == 1) {
			value = false;
		}
		else {
			if (number - 10 < 0) {
				value = false;
			}
			
			else {
				if (number - 100 >= 0) {
					value = false;
				}
				
				else {
					value = true;
				}
			}
		}
		
		System.out.println(value);

	}

}
