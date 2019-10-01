package coyle.unit1;

import java.util.Scanner;
/**
 * ObjectHeight.java
 * Calculates the height of an object using an equation that includes
   a time inputed by the user
 * September 23, 2019
 * @author Sydney Coyle
 */

public class ObjectHeight {
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a time less than 4.5 seconds");
		double t = sc.nextDouble();
		double h;
		h =100 - 2.9 * t * t;
		System.out.println("The height of the object is:" + h);
	}
}
