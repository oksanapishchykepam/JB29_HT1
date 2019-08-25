package Homework;

/* Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. */

import static java.lang.Math.*;

public class Task20 {

	public static void main(String[] args) {
		double length = 34;
		double radius = length / 2 / PI;
		double square = PI * pow(radius, 2);

		System.out.println("Площадь круга, ограниченного окружностью длиной " + length + " равна " + square);
	}

}
