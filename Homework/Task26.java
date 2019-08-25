package Homework;

import static java.lang.Math.*;

/* Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. */

public class Task26 {

	public static void main(String[] args) {
		double side1 = 12.1;
		double side2 = 10.6;
		
		double angleDegree = 37;
		double angleRadians = angleDegree * PI / 180;
		
		double square = (side1 * side2 * sin(angleRadians)) / 2;
		
		System.out.println("Площадь треугольника равна " + square);
	}

}
