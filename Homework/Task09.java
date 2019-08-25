package Homework;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 * a/c + b/d - (a*b-c)/(c*d). */

public class Task09 {

	public static void main(String[] args) {
		
		double a = 32;
		double b = 11;
		double c = 12;
		double d = 9;
		
		double interim1 = (a / c) + (b / d); //3.8888
		double interim2 = ((a * b) - c) / (c * d);

		double result = interim1 - interim2;
		
		System.out.println("Результат исходного выражения равен " + result);
	}

}
