package Homework;

/*Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). 
 * Найти его периметр и площадь. */

import static java.lang.Math.*;

public class Task13 {

	public static void main(String[] args) {
		double x1 = 12;
		double y1 = -5;
		double x2 = 8;
		double y2 = 1;
		double x3 = 0;
		double y3 = 3;
		
		double line1 = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
		double line2 = sqrt(pow((x3 - x2), 2) + pow((y3 - y2), 2));
		double line3 = sqrt(pow((x1 - x3), 2) + pow((y1 - y3), 2));
		
		double perimeter = line1 + line2 + line3;
		
		double halfPerimeter = perimeter / 2;
		double square = sqrt(halfPerimeter * (halfPerimeter - line1) * (halfPerimeter - line2) * (halfPerimeter - line3));
		
		System.out.println("Периметр треугольника равен " + perimeter);
		System.out.println("Площадь треугольника равна " + square);

	}

}
