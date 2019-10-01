package coyle.unit1;

import java.util.Scanner;
/**
 * Digits.java
 * Tells the user the place values of any chosen number from 0-999
 * September 30, 2019
 * @author Sydney Coyle
 */

public class  Digits{

	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a three digit number");
		int n = sc.nextInt();
		int h = n/100;
		System.out.println("Hundreds: " + h);
		int t = n%100/10;
		System.out.println("Tens: " + t);
		int o = n%10;
		System.out.println("Ones: " + o);
	}
}