package Homework;

import java.util.Random;

/* * Дано значение х. Получить значения -2х + 3х^2 - 4х^3 и 1 + 2х + 3х^2 + 4х^3 . Позаботьтесь об экономии операций. */

public class Task40 {

	public static void main(String[] args) {
		Random newNumber = new Random();

		int x = newNumber.nextInt(20);
		
		// Преобразуем выражение 1: -2х + 3х^2 - 4х^3 (8 операций)
		// -x * ((4*x - 1) *(x + 1) + 3) (6 операций)
		int result1 =  -x * ((4*x - 1) *(x + 1) + 3);
		
		// Преобразуем выражение 1: 1 + 2х + 3х^2 + 4х^3 (9 операций)
		// x * ((4 * x - 1)*(x + 1) + 3) + 1 (7 операций)
		int result2 =  x * ((4 * x - 1)*(x + 1) + 3) + 1; 
		
		System.out.println("x = " + x);
		System.out.println("Результат 1 выражения = " + result1);
		System.out.println("Результат 2 выражения = " + result2);
		
	}

}
