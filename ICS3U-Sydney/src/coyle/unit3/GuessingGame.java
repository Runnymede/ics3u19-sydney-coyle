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
		String input;
		String[] guess = {"apple","orange","grapefruit","pineapple","grapes", "banana",
				"mango","dragonfruit","strawberry","kiwi","pear","plum","peach",
				"watermelon","","","","","",""};
		
		//
		System.out.println("Type in a fruit and ill try to guess it");
		input = sc.next();
		
		
		
		sc.close();
	}
}