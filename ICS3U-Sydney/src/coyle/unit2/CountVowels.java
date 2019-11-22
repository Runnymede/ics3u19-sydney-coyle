package coyle.unit2;

import java.util.Scanner;
/**
 * CountVowels.java <br>
 * counts the number of vowels in a phrase <br>
 * November 18, 2019
 * @author Sydney Coyle
 */

public class CountVowels {
	/**
	 * Entry point to the program
	 * @param args
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//user input
		System.out.println("Enter a phrase");
		String phrase = sc.nextLine();

		//variable assignments
		int length = phrase.length();
		int index = 0;
		int counter =0;

		
		for (int i = 0; i < length; i++) {
			char character = phrase.charAt(index);

			//checking each vowel
			if (String.valueOf(character).equalsIgnoreCase("a") || String.valueOf(character).equalsIgnoreCase("e")|| String.valueOf(character).equalsIgnoreCase("i")|| String.valueOf(character).equalsIgnoreCase("o")|| String.valueOf(character).equalsIgnoreCase("u"))
				counter++;
			index++;
		}
		//output
		System.out.println(phrase +" has "+ counter +" vowels");
		sc.close();
	}
}