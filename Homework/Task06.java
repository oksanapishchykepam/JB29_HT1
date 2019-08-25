package Homework;

/* Написать код для решения задачи. В n малых бидонах 80 л молока. 
 * Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
 */

public class Task06 {

	public static void main(String[] args) {
	
		int smallCanQuantity = 8;
		int bigCanQuantity = 6;
		
		int smallCanVol = 80 / smallCanQuantity;
		int bigCanVol = smallCanVol + 12;
		
		int commonBigCanVolume = bigCanQuantity * bigCanVol;
		
		System.out.println("В " + bigCanQuantity + " бидонах " + commonBigCanVolume + " литра молока");
	}

}
