package coyle.unit2;

import java.util.Scanner;
/**
 * PrimeNumbers.java <br>
 * figures out if a number is prime or not <br>
 * November 14, 2019
 * @author Sydney Coyle
 */

public class PrimeNumbers {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//user input
		System.out.println("Enter a number");
		int num = sc.nextInt();

		//variables
		int div = 2;
		int sum;
		boolean prime = true;

		//checking each number
		while (div <num) {
			sum = num % div;
			div = div +1;

			if (sum == 0) {
				prime = false;
				break;
			}
		}
		//output
		if(!prime) 
			System.out.println("not prime");

		else
			System.out.println("prime");
		sc.close();
	}
}

