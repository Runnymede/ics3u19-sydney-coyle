package coyle.unit1;

import java.util.Scanner;
/**
 * Quadratics.java
 * Takes any three numbers and uses the quadratic formula to solve for the two possible roots
 * September 30, 2019
 * @author Sydney Coyle
 */

public class  Quadratics{  

	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println ("Please enter a value for a");
		int a = sc.nextInt();
		System.out.println ("Please enter a value for b");
		int b = sc.nextInt();
		System.out.println ("Please enter a value for c");
		int c = sc.nextInt();

		double x = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		double xx = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.print("The two roots are " + x );
		System.out.print(" and " + xx);
	}
}