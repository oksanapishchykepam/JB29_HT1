package Homework;

import java.util.Random;

/* Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 * x = [0; 4]; y = [0; 4]; x^2 + y^2 <= 16;  or  x = [0; 5]; y = [-5; 0]; x^2 + y^2 <= 25;*/

public class Task38_c {

	public static void main(String[] args) {
		boolean value = false;
		
		Random random = new Random();
		int dotX = random.nextInt(6);
		int dotY = random.nextInt(5);
		
		if (dotY >= 0 && dotY <= 4 ) {
			if (dotX >= 0 && dotX <= 4 ) {
				if (Math.pow(dotX, 2) + Math.pow(dotY, 2) <= 16) {
					value = true;
				}
			}
		}
		else {
			if (dotY >= -5 && dotY <= 0 ) {
				if (dotX >= 0 && dotX <= 5 ) {
					if (Math.pow(dotX, 2) + Math.pow(dotY, 2) <= 25) {
						value = true;
					}
				}
			}
		}
		
		System.out.println("x=" + dotX + "\n" + "y=" + dotY);
		System.out.println(value);
	}

}
