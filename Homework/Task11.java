package Homework;

/* Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.  */

public class Task11 {

	public static void main(String[] args) {
		double cathet1 = 3;
		double cathet2 = 4;
		double hypotenuse = Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));
		
		double perimeter = cathet1 + cathet2 + hypotenuse;
		double square = cathet1 * cathet2 / 2;
		
		System.out.println("Периметр прямоугольного треугольника с катетами " + cathet1 + " и " + cathet2 + " равен " + perimeter);
		System.out.println("Площадь прямоугольного треугольника с катетами " + cathet1 + " и " + cathet2 + " равна " + square);
	}

}
