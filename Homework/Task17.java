package Homework;

/* Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел. */

import static java.lang.Math.*;

public class Task17 {

	public static void main(String[] args) {
		double a = 5;
		double b = -7;
		
		double avgOfCubes = (pow(a, 3) + pow(b,3));
		double geometric = sqrt(abs(a) + abs(b));
		
		System.out.println("Среднее арифметическое кубов чисел " + a + " и " + b + " равно " + avgOfCubes);
		System.out.println("Среднее геометрическое модулей чисел " + a + " и " + b + " равно " + geometric);

	}

}
