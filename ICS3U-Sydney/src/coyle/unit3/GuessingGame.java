package coyle.unit3;

import java.util.Scanner;

/**
 * GuessingGame.java <br>
 * Asks the user to think of a colour and then randomly outputs colours until it guesses right <br>
 * November 29, 2019
 * @author Sydney Coyle
 */

public class GuessingGame {
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		//variables
		String answer = "no";
		String[] guess = {"apple","orange","grapefruit","pineapple","grapes", "banana",
				"mango","dragonfruit","strawberry","kiwi","pear","plum","peach",
				"watermelon","cherry","coconut","jackfruit","lime","passionfruit","lemon"};

		//instructions
		System.out.println("Think of a fruit and i'll try to guess it");


		for (int i = 0; i < 20; i++) {
			System.out.println("is it a "+ guess[(int)(Math.random()*20)]);	
			answer = sc.next();

			if (answer.equals("yes")) {
				System.out.println("i win!");
				break;
			}
		}

		sc.close();
	}
}