package Homework;

import java.util.Random;

/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
2x^4 - 3х^3 + 4х^2 - 5х + 6. */

public class Task39 {

	public static void main(String[] args) {
		
		Random newNumber = new Random();
		
		int x = newNumber.nextInt(20);
		
		// преобразуем исходное выражение (14 операций) в следующееЖ
		// x(x^2 + 2)(2x-3) + x + 6. (8 операций)
		int result = x * (x * x + 2) * (2 * x - 3) + x + 6;
					
		System.out.println("x = " + x);
		System.out.println("Результат = " + result);
			
		

	}

}
