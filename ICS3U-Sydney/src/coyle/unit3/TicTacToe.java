package coyle.unit3;

import java.util.Scanner;

/**
 * TicTacToe.java
 * 
 * November 26, 2019
 * @author Sydney Coyle
 */

public class TicTacToe {
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		char[][] board = new char [3][3];


		System.out.println("what row");
		int row = sc.nextInt();
		System.out.println("what col");
		int col = sc.nextInt();
		
		board[row][col] = 'x';
		System.out.println(board[row][col]);

		for (int row = 0; row< board.length; row ++) {


			for  (int col = 0; col< board[row].length; col++) 
				System.out.println(board[row][col]);
		}
		System.out.println();
	}


}
