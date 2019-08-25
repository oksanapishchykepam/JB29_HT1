package Homework;

/* Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).  */

public class Task12 {

	public static void main(String[] args) {
		double x1 = 5;
		double x2 = 8;
		double y1 = -1;
		double y2 = 3;
		
		double distx = Math.abs(x2 - x1);
		double disty = Math.abs(y2 - y1);
		
		double dist = Math.sqrt(Math.pow(distx, 2) + Math.pow(disty, 2));
		
		System.out.println("Расстояние между точками = " + dist);
	}

}
