package Homework;

/* Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, 
 * получить значение а8 за три операции и а10 за четыре операции. */

public class Task27 {

	public static void main(String[] args) {
		int a = 2;
		
		// #1
		int a2 = a*a;
		// #2
		int a4 = a2*a2;
		// #3
		int a8 = a4*a4;
		System.out.println("Число " + a + " в степени 8 равно " + a8);
		
		
		// #1 и #2 повторяются
		// #3
		int a5 = a4*a;
		// #4
		int a10 = a5*a5;
		System.out.println("Число " + a + " в степени 10 равно " + a10);
		

	}

}
