package Homework;

/* Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с. */

import static java.lang.Math.*;

public class Task29 {

	public static void main(String[] args) {
		double side1 = 12.3;
		double side2 = 10.0;
		double side3 = 8.99;
		
		double perimeter = side1 + side2 + side3;
		double halfPerimeter = perimeter / 2;
		double square = sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
		
		double angle1 = Math.asin(2 * square / side1 / side2);
		double angle2 = Math.asin(2 * square / side2 / side3);
		double angle3 = Math.asin(2 * square / side3 / side1);
		
		double angle1Degree = angle1 * 180 / PI;
		double angle2Degree = angle2 * 180 / PI;
		double angle3Degree = angle3 * 180 / PI;
		
		System.out.println("Углы треугольника(в радианах) со сторонами " + side1 + ", " + side2 + " и " + side3 + " равны " + angle1 + ", " + angle2 + " и " + angle3);
		System.out.println("Углы треугольника(в градусах) со сторонами " + side1 + ", " + side2 + " и " + side3 + " равны " + angle1Degree + ", " + angle2Degree + " и " + angle3Degree);
	}

}
