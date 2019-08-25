package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Треугольник со сторонами а,b,с является равнобедренным. */

public class Task37_6 {

	public static void main(String[] args) {
		
		boolean value;
		
		int side1 = 5;
		int side2 = 12;
		int side3 = 12;
		
		if (side1 == side2) {
			value = true;
		}
		else {
			if (side2 == side3) {
				value = true;
			}
			else {
				if (side3 == side1) {
					value = true;
				}
				else {
					value = false;
				}
			}
		}

		System.out.println(value);
	}

}
