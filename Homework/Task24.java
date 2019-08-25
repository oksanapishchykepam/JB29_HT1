package Homework;

/* Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а. */

import static java.lang.Math.*;

public class Task24 {

	public static void main(String[] args) {
		double baseLarge = 18;
		double baseSmall = 13;
		double angleDegree = 45;
		double angleRadians = angleDegree * PI / 180;
		
		double cathet = (baseLarge - baseSmall) / 2;	
		double height =  cathet * tan(angleRadians);
		
		double square = (baseLarge + baseSmall) * height / 2;
		
		System.out.println("Площадь трапеции с основаниями "  + baseLarge + " и "  + baseSmall + " и углом при большем основании " + angleDegree + " градусов равна " + square);

	}

}
