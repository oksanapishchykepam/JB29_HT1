package Homework;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Task22 {

	public static void main(String[] args) {
		
		int timeInSec = 3784;
		
		int hours = timeInSec / 3600;
		int remain = timeInSec - (hours * 3600);
		
		int minutes = remain / 60;
		remain = remain - (minutes * 60);
	
		int seconds = remain;
		
		
		String hours1;
		String minutes1;
		String seconds1;
		
		
		if (hours < 10) {
			hours1 = "0" + hours;
		}
		else {
			hours1 = Integer.toString(hours);
		}
		
		
		if (minutes < 10) {
			minutes1 = "0" + minutes;
		}
		else {
			minutes1 = Integer.toString(minutes);
		}
		
		
		if (seconds < 10) {
			seconds1 = "0" + seconds;
		}
		else {
			seconds1 = Integer.toString(seconds);
		}
		
		System.out.println(hours1 + "ч " + minutes1 + "мин " + seconds1 + "с. ");

	}

}
