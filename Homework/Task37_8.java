package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4). */

import static java.lang.Math.*;

public class Task37_8 {

	public static void main(String[] args) {
		boolean value = false;
		
		int number = 256;
		int numberA = 16;
		
		for (int power = 0; power <= 4; power++) {
						
			if (pow(numberA, power) == number) {
				value = true;
			}
		
		}
		
		System.out.println(value);

	}

}
