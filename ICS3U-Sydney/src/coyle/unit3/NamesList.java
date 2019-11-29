package coyle.unit3;

import java.util.Scanner;

/**
 * NamesList.java <br>
 * Asks user for a set of names. prints them forwards than backwards <br>
 * November 22, 2019
 * @author Sydney Coyle
 */

public class NamesList {
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);


		//asking for number of names
		System.out.println("How many names do you want to print");
		int nameNum = sc.nextInt();
		String[] name = new String [nameNum];


		//asking for each name
		System.out.println("Enter the " +nameNum+" names one by one");
		for (int i = 0; i<nameNum; i++) {
			name[i] =  sc.next();
			
		}
		System.out.println();
		
		//printing names forwards
		for (int i = 0; i<nameNum; i++) {

			System.out.println(name[i]);
			
		}
		System.out.println();
		
		//printing names backwards
		for (int i = nameNum-1; i >= 0; i--) {

			System.out.println(name[i]);
		}

		sc.close();
	}
}
