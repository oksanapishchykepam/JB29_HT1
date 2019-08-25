package Homework;

/*Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.. */

import static java.lang.Math.*;

public class Task14 {

	public static void main(String[] args) {
		double r = 5.25;
		
		double length = 2 * PI * r;
		double square = PI * pow(r, 2);
			
		System.out.println("Длина окружности равна " + length);
		System.out.println("Площадь окружности равна " + square);
	}

}
