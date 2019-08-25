package Homework;

/* Составить программу перевода радианной меры угла в градусы, минуты и секунды. */

import static java.lang.Math.*;

public class Task28 {

	public static void main(String[] args) {
		double angle = 30;
		
		double radians = angle * PI / 180;
		double minutes = angle * 60;
		double seconds = minutes * 60;
		
		System.out.println("Угол " + angle + " градусов равен " + radians + " радианам, или " + minutes + " минутам, или " + seconds + " секундам");

	}

}
