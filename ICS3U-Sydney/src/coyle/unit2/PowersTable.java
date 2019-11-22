package coyle.unit2;

import java.util.Scanner;

/**
 * PowersTable.java <br>
 * prints a table of powers up to 5^6 <br>
 * November 14, 2019
 * @author Sydney Coyle
 */

public class PowersTable {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//user picking the maximum base number
		System.out.println("enter a base number");
		int row = sc.nextInt();

		//user picking the maximum power number
		System.out.println("enter a power number");
		int column = sc.nextInt();

		//headers
		for (int x = 1; x <= column; x++) {
			System.out.format("%10s", "x^"+ x);
		}
		System.out.println();

		//printing the table
		for (int i = 1; i <= row; i++) {
			for (int x = 1; x <= column; x++) {
				System.out.format("%10s", (int)Math.pow(i,x));
			}
			System.out.println();
		}

		sc.close();
	}
}
