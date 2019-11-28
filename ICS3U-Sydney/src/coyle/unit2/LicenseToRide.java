package coyle.unit2;

import java.util.Scanner;
/**
 * LicenseToRide.java <br>
 * calculates the probability of having a license plate that adds up to 34 or more <br>
 * November 14, 2019
 * @author Sydney Coyle
 */

public class LicenseToRide {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//variables
		int total = 0;
		double counter =0;
		double probability;

		//generating each number
		for (int a = 9; a >= 0; a--) {
			for (int b = 9; b >= 0; b--) {
				for (int c = 9; c >= 0; c--) {
					for (int d = 9; d >= 0; d--) {

						total = a+b+c+d;
						if (total >=34)
							counter++;
					}
				}
			}
		}
		//calculating probability
		probability = counter/100;
		System.out.println("the probability is " + probability +"%");
		sc.close();
	}
}