package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). */

import static java.lang.Math.*;

public class Task37_9 {

	public static void main(String[] args) {
		boolean value;
		
		int number1 = 3;
		int number2 = 5;
		int number3 = 0;
		
		int dotX = 1;
		int dotY = 8;
		
		int function = number1 * (int)pow(dotX, 2) + number2 * dotX + number3;
		 
		if (function == dotY) {
			value = true;
		}
		else {value = false;}
		
		System.out.println(value);

	}

}
