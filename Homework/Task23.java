package Homework;

/* Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r). */

import static java.lang.Math.*;

public class Task23 {

	public static void main(String[] args) {
		double radiusInt = 7;
		double radiusExt = 12;
		
		double square = PI * (pow(radiusExt, 2) - pow(radiusInt, 2));

		System.out.println("Площадь кольца равна " + square);
	}

}
