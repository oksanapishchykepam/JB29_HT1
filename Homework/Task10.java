package Homework;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 * (sinx+cosy)/(cosx−siny)∗ tgxy  */

public class Task10 {

	public static void main(String[] args) {
		
		double x = 5;
		double y = 7;
		
		double interim1 = Math.sin(x) + Math.cos(y);
		double interim2 = Math.cos(x) - Math.sin(y);
		double interim3 = Math.tan(x * y);
		
		double result = interim1 / interim2 * interim3;
				
		System.out.println("Результат исходного выражения равен " + result);

	}

}
