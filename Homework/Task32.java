package Homework;

/* Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с? */

public class Task32 {

	public static void main(String[] args) {
		int currentHour = 7;
		int currentMin = 17;
		int currentSec = 56;
		
		int passedHour = 17;
		int passedMin = 49;
		int passedSec = 23;
		
		int newHour = currentHour + passedHour;
		int newMin = currentMin + passedMin;
		int newSec = currentSec + passedSec;
		
		if (newSec >= 60) {
			newSec = newSec - 60;
			newMin = newMin + 1;
		}
		
		if (newMin >= 60) {
			newMin = newMin - 60;
			newHour = newHour + 1;
		}

		if (newHour >= 24) {
			newHour = newHour - 24;
			
			System.out.println("Через пройденное время часы будут показывать " + newHour + " ч " + newMin + " мин " + newSec + " сек следующего дня");
		}
		else {
			System.out.println("Через пройденное время часы будут показывать " + newHour + " ч " + newMin + " мин " + newSec + " сек");
		}
		
	}

}
