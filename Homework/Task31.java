package Homework;

/*Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, 
 * скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.*/

public class Task31 {

	public static void main(String[] args) {
		double boatSpeed = 23.0;
		double riverSpeed = 14.87;
		
		double crosscurrentSpeed = boatSpeed - riverSpeed;
		double lakeTime = 1.5;
		double riverTime = 2.0;

		double pathLake = boatSpeed * lakeTime;
		double pathRiver = crosscurrentSpeed * riverTime;
		
		System.out.println("Путь, пройденный лодкой по озеру, равен " + pathLake + " км");
		System.out.println("Путь, пройденный лодкой по реке, равен " + pathRiver + " км");
	}

}
