package Homework;

import java.util.Random;

/* Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 * x = [-4; 0], y = [0; 4], y <= x + 4 or x = [0; 4], y = [0; 4], y <= 4 - x */

public class Task38_a {

	public static void main(String[] args) {
		boolean value = false;
		
		Random random = new Random();
		int dotX = random.nextInt(12);
		int dotY = random.nextInt(4);

		
		if (dotY >= 0 && dotY <= 4 ) {
			if (dotX >= -4 && dotX <= 0 ) {
				if (dotY <= dotX + 4) {
					value = true;
				}
			}
			else {
				if (dotX > 0 && dotX <= 4 ) {
					if (dotY <= 4 - dotX) {
						value = true;
					}
				}
			}
		}
		
		System.out.println("x=" + dotX + "\n" + "y=" + dotY);
		System.out.println(value);
	}
}