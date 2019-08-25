package Homework;

/* Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей. */

import static java.lang.Math.*;

public class Task19 {

	public static void main(String[] args) {
		double side = 4.7;
		double height = side * sqrt(3) / 2;
		double square = side * height / 2;
		double radiusInternal = side / 2 / sqrt(3);
		double radiusExternal = side / sqrt(3);
		
		System.out.println("Площадь равностороннего треугольника со стороной " + side + " равна " + square);
		System.out.println("Высота равностороннего треугольника со стороной " + side + " равна " + height);
		System.out.println("Радиус вписанной окружности равностороннего треугольника со стороной " + side + " равен " + radiusInternal);
		System.out.println("Радиус описанной окружности равностороннего треугольника со стороной " + side + " равен " + radiusExternal);
	}

}
