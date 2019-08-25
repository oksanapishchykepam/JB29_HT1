package Homework;

/* Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. */

import static java.lang.Math.*;

public class Task18 {

	public static void main(String[] args) {
		double cubeEdge = 5.2;
		
		double squareFace = pow(cubeEdge, 2);
		double squareCube = squareFace * 6;
		double volumeCube = pow(cubeEdge, 3);
		
		System.out.println("Площадь грани куба со стороной " + cubeEdge + " равна " + squareFace);
		System.out.println("Площадь полной поверхности куба со стороной " + cubeEdge + " равна " + squareCube);
		System.out.println("Объем куба со стороной " + cubeEdge + " равна " + volumeCube);

	}

}
