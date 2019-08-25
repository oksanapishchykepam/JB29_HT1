package Homework;

import java.util.Random;

/* Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 * x = [-4; 4], y = [-3; 0] or x = [-2; 2], y = [0; 4]*/

public class Task38_b {

	public static void main(String[] args) {
		boolean value = false;
		
		Random random = new Random();
		int dotX = random.nextInt(10);
		int dotY = random.nextInt(5);
		
		
		if (dotX >= -2 && dotX <= 2	) {
			if (dotY >= 0 && dotY <= 4) {
				value = true;
			}
		}
		else {
			if (dotX >= -4 && dotX <= 4	) {
				if (dotY >= -3 && dotY <= 0) {
					value = true;
				}
			}
			
		}
		
		
		System.out.println("x=" + dotX + "\n" + "y=" + dotY);
		System.out.println(value);
	}

}
