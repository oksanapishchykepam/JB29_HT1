package Homework;

/* Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
 * */

public class Task01 {
	public static void main (String [] args) {
		
		double x;
		double y;
		
		x = 23.34;
		y = 15.12;
		
		double sum = x + y;
		double diff = x - y;
		double multi = x * y;
		double quot = x / y; 
		
		System.out.println(x + " + " + y + " = " + sum);
		System.out.println(x + " - " + y + " = " + diff);
		System.out.println(x + " * " + y + " = " + multi);
		System.out.println(x + " / " + y + " = " + quot);
	}
}
