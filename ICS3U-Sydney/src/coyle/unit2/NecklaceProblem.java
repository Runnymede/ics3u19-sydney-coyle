package coyle.unit2;

import java.util.Scanner;

/**
 * NecklaceProblem.java <br>
   adds two user inputed numbers together to get a third number and saves only the ones digit
   then adds the second and third to get a fourth number and saves only the ones digit
 * continues unit the first two numbers are repeated <br>
 * November 14, 2019
 * @author Sydney Coyle
 */

public class NecklaceProblem {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//variable decelerations
		int num1 = 0;
		int num2 = 0;
		int sum = 0;

		//user input
		System.out.println("Enter a number");
		int input1 = sc.nextInt();
		System.out.println("Enter another number");
		int input2 = sc.nextInt();

		//variable assignments
		num1 = input1;
		num2 = input2;
		//printing starting values
		System.out.println(num1);
		System.out.println(num2);

		//printing each number
		do {
			sum = (num1 + num2)%10;
			System.out.println(sum);

			num1 = num2;
			num2 = sum;
		}while(num1 != input1 || num2 != input2);
		sc.close();
	}
}
