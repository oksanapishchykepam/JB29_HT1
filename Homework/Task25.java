package Homework;

/* Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
 * (предполагается, что а≠0 и что дискриминант уравнения неотрицателен). */

import static java.lang.Math.*;

public class Task25 {

	public static void main(String[] args) {
		double a = 1;
		double b = 4;
		double c = 4;
		
		double discr = pow(b, 2) - 4 * a * c;
		
		if (discr >= 0) {
			
			if (discr == 0) {
				
				double x = (-1 * b) / (2 * a);			
			System.out.println("Квадратное уравнение имеет один корень равный " + x);
			}
			
			else {
			
			double x1 = (-1 * b + sqrt(discr)) / (2 * a);
			double x2 = (-1 * b - sqrt(discr)) / (2 * a);
			
			System.out.println("Корни квадратного уравнения равны " + x1 + " и " + x2);	
			}
		}
		
		else {
			System.out.println("Квадратное уравнение не имеет корней");
		}

	}

}
