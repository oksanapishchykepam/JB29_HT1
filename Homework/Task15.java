package Homework;

/* Написать программу, которая выводит на экран первые четыре степени числа π. */

import static java.lang.Math.*;

public class Task15 {

	public static void main(String[] args) {
		int power = 0;
		
		while (power < 4) {
			double result = pow(PI, power);
			System.out.println("Число PI в степени " + power +  " равно "+ result);
			power++;
		}

	}

}
