package Homework;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа. */

import java.text.DecimalFormat;

public class Task21 {

	public static void main(String[] args) {
		double number = 123.456;
		
		double intPart = (int)number;
		double newIntPart = (number - intPart) * 1000;
		double newDecimalPart = intPart / 1000;
		
		double newNumber = newIntPart + newDecimalPart;
		
		DecimalFormat newFormat = new DecimalFormat("#0.000");
		
		System.out.println(newFormat.format(newNumber));
	}

}
