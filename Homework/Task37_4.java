package Homework;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае:
 * Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= m, х= n (m<n). */

public class Task37_4 {

	public static void main(String[] args) {
		
		boolean value;
		int lineN = 4;
		int lineM = 14;
		
		int xDot = 3;
		
		if (xDot >= lineN) {
			if (xDot <= lineM) {
				value = true;
			}
			
			else {
				value = false;
			}
		}
		else {
			value = false;
		}

		System.out.println(value);
	}

}
