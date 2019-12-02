package coyle.unit3;

import java.util.Scanner;

/**
 * TicTacToe.java <br>
 * creates a grid and allows the user to play a game of tic tac toe <br>
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
		//variables
		char[][] board = new char [3][3];
		char player = 'x';
		int rowNum = 0;
		int colNum = 0;

		for (int turn = 0; turn <9; turn++) {

			//X's turn
			if (player == 'x') {
				System.out.println("what row would you like to place X");
				rowNum = sc.nextInt();
				System.out.println("what column would you like to place X");
				colNum = sc.nextInt();
				board[rowNum-1][colNum-1] = 'x';

				//making the board
				for (int i = 0; i< board.length; i ++) {

					for  (int j = 0; j< board[i].length; j++) 
						System.out.print(board[i][j] +" |");
					System.out.println();
					System.out.println("_________");
				}
				System.out.println();
				player = 'o';
			}

			//O's turn
			else {
				System.out.println("what row would you like to place O");
				rowNum = sc.nextInt();
				System.out.println("what column would you like to place O");
				colNum = sc.nextInt();
				board[rowNum-1][colNum-1] = 'o';

				//making the board
				for (int i = 0; i< board.length; i ++) {

					for  (int j = 0; j< board[i].length; j++) 
						System.out.print(board[i][j] +" |");
					System.out.println();
					System.out.println("_________");
				}
				System.out.println();
				player = 'x';
			}


			//X wins
			//horizontal
			if (board[0][0] == 'x' && board [0][1] == 'x' && board [0][2] == 'x') {
				System.out.println("X wins");
				break;
			}

			else if (board[1][0] == 'x' && board [1][1] == 'x' && board [1][2] == 'x') {
				System.out.println("X wins");
				break;
			}

			else if (board[2][0] == 'x' && board [2][1] == 'x' && board [2][2] == 'x') {
				System.out.println("X wins");
				break;
			}

			//vertical
			else if (board[0][0] == 'x' && board [1][0] == 'x' && board [2][0] == 'x') {
				System.out.println("X wins");
				break;
			}

			else if (board[0][1] == 'x' && board [1][1] == 'x' && board [2][1] == 'x') {
				System.out.println("X wins");
				break;
			}

			else if (board[0][2] == 'x' && board [1][2] == 'x' && board [2][2] == 'x') {
				System.out.println("X wins");
				break;
			}

			//diagonal
			else if (board[0][0] == 'x' && board [1][1] == 'x' && board [2][2] == 'x') {
				System.out.println("X wins");
				break;
			}

			else if (board[2][0] == 'x' && board [1][1] == 'x' && board [0][2] == 'x') {
				System.out.println("X wins");
				break;
			}


			//O wins
			//horizontal
			if (board[0][0] == 'o' && board [0][1] == 'o' && board [0][2] == 'o') {
				System.out.println("O wins");
				break;
			}

			else if (board[1][0] == 'o' && board [1][1] == 'o' && board [1][2] == 'o') {
				System.out.println("O wins");
				break;
			}

			else if (board[2][0] == 'o' && board [2][1] == 'o' && board [2][2] == 'o') {
				System.out.println("O wins");
				break;
			}

			//vertical
			else if (board[0][0] == 'o' && board [1][0] == 'o' && board [2][0] == 'o') {
				System.out.println("O wins");
				break;
			}

			else if (board[0][1] == 'o' && board [1][1] == 'o' && board [2][1] == 'o') {
				System.out.println("O wins");
				break;
			}

			else if (board[0][2] == 'o' && board [1][2] == 'o' && board [2][2] == 'o') {
				System.out.println("O wins");
				break;
			}

			//diagonal
			else if (board[0][0] == 'o' && board [1][1] == 'o' && board [2][2] == 'o') {
				System.out.println("O wins");
				break;
			}

			else if (board[2][0] == 'o' && board [1][1] == 'o' && board [0][2] == 'o') {
				System.out.println("O wins");
				break;
			}
		}

		sc.close();
	}
}
