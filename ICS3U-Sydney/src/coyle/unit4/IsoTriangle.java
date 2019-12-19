package coyle.unit4;

import java.util.Scanner;
/**
 * IsoTriangle.java <br>
 * ask user for a number then prints a triangle with that many rows <br>
 * December 17, 2019
 * @author Sydney Coyle
 */

public class IsoTriangle {

	/** 
	 *Entry to the program
	 *@param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Variables 
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int spaces = size -1;
		int stars = 1;

		//loop for each row
		for (int i = 0; i < size; i++){
			drawSpaces(spaces);
			drawStars(stars);
			
			spaces--;
			stars+=2;
		}
		sc.close();

	}
	//method for printing spaces
	public static void drawSpaces(int spaces) {
		//spaces per line
		for (int i = spaces ; i >=0 ; i--){
			System.out.print(" ");
		}

	}
	//method for printing stars
	public static void drawStars(int stars) {
		//stars per line
		for (int i= 0; i< stars; i++){
			System.out.print("*");

		}
		System.out.println();
	}
	
}
