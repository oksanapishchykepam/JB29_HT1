package Homework;

/* Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.*/

public class Task30 {

	public static void main(String[] args) {
		double resistor1 = 15.0;
		double resistor2 = 10.5;
		double resistor3 = 8.79;
		
		double r12 = resistor1 * resistor2;
		double r13 = resistor1 * resistor3;
		double r23 = resistor2 * resistor3;
		double r123 = resistor1 * r23;
		
		double resistance = r123 / (r12 + r23 + r13);
		
		System.out.println("Сопротивление соединения равно " + resistance + " Ом.");

	}

}
