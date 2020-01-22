package Culminating;

import hsa_new.Console;
import java.util.ArrayList;
/**
 * Simon.java <br>
 * Displays letter(s) on the screen for one second then clears it
 * and waits for the user to type in the same letter(s) 
 * then tells the user if they are right or not<br>
 * January 10, 2020
 * @author Sydney Coyle
 */

public class Simon {

	static ArrayList<Character> pattern = new ArrayList<Character>();
	static String guess;
	static int level;
	static int again;

	static Console c = new Console ();
	
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main(String[] args) throws InterruptedException {
		//introduction
		c.println("Welcome to Simon!\nIn this game, the computer will display a series of letters.");
		c.println("Your job is to type in the exact same letters in the exact same order.");
		c.println("If you get the pattern right you may move on to the next level.");
		c.println("However, if you get it wrong, you will be sent back to level 1.");
		c.println("Pass level 5 to win the game!");
		Thread.sleep(8000);

		level=1;
		//loops each task every level
		do {
			createPattern();
			printPattern();
			getAnswer();
			levelNum();
		}while(again == 1);
	}

	/** 
	 *Keeps track of the game level and determines if they lose
	 * @throws InterruptedException 
	 */
	public static void levelNum() throws InterruptedException {
		boolean rightAnswer = checkAnswer();
		//player guesses the right letter
		if(rightAnswer == true) {	
			level++;
			again = 1;
		}
		//player guesses the wrong letter
		else {
			level = 1;
			again = 1;
		}
		//player wins
		c.clear();
		c.println("Level " +level);
		Thread.sleep(1000);

		if (level>5) {
			c.println("Wow! you beat level 5!\nYou win!");
			again = 0;
		}
		
	}

	/** 
	 *generates the random letters used for the pattern
	 */
	public static void createPattern() {
		int character = 0;
		pattern.clear();
		for(int i = 0; i <level; i++) {
			character = (int) (Math.random()*26 + 97);
			pattern.add((char) character);
		}
	}

	/** 
	 *outputs the pattern once its made
	 */
	public static void printPattern() throws InterruptedException{
		c.clear();
		for (int i = 0; i <pattern.size(); i++){
			c.println (pattern.get(i));
			Thread.sleep(1000);
			c.clear();
		}
	}
	/** 
	 *gets input from the user
	 */
	public static void getAnswer() {
		c.println("your answer:");
		guess = c.readLine();
	}

	/** 
	 *determines whether the users answer matches the computers or not
	 *@param guess
	 *@return if the users answer is correct or not
	 */
	public static boolean checkAnswer() {
		boolean right = false;
		for(int i = 0; i < pattern.size(); i++) {
			char answer = guess.charAt(i);
			//users answer is right
			if(answer == pattern.get(i)) {
				right = true;
			}
			//users answer is wrong
			else {
				return false;
			}
		}
		return right;
	}
}