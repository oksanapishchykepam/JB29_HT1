package Homework;

/* Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации. */

import static java.lang.Math.*;
public class Task34 {

	public static void main(String[] args) {
		int volumeInBytes = 341263246;
		
		double volumeInKb = (double)volumeInBytes / pow(10, 3);
		double volumeInMb = volumeInKb / pow(10, 3);
		double volumeInGb = volumeInMb / pow(10, 3);
		double volumeInTb = volumeInGb / pow(10, 3);
		
		System.out.println(volumeInBytes + " байт равно " + volumeInKb + " кб");
		System.out.println(volumeInBytes + " байт равно " + volumeInMb + " Мб");
		System.out.println(volumeInBytes + " байт равно " + volumeInGb + " Гб");
		System.out.println(volumeInBytes + " байт равно " + volumeInTb + " Тб");
	}
}
