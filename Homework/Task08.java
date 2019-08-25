package Homework;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *  (b + √(b^2 + 4*a*c) / 2*a) - a^3*c + b^(-2) */

public class Task08 {

	public static void main(String[] args) {
	
		double a = 15;
		double b = 10;
		double c = 2;
		
		double interim0 = Math.pow(b, 2) + 4 * a * c;
		double interim1 = (b + Math.sqrt(interim0)) / (2 * a);
		double interim2 = (Math.pow(a, 3) * c) + Math.pow(b, -2); 

		double result = interim1  - interim2;
		
		System.out.println("Результат исходного выражения равен " + result);

	}

}
