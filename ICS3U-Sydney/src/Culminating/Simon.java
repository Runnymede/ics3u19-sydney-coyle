package Culminating;

import java.util.Scanner;
import java.util.ArrayList;


public class Simon {


	static ArrayList<Character> pattern = new ArrayList<Character>();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Simon!\nIn this game, the computer will display a series of letters.");
		System.out.println("Your job is to type in the exact same letters in the exact same order.");
		System.out.println("If you get the pattern right you may move on to the next level.");
		System.out.println("However, if you get it wrong, you will be sent back to level 1.");
		System.out.println("Pass level 10 to win the game!");
		
		levelNum(level,guess);
		printPattern();
	}
	public static int levelNum(int level,String guess) {
		level++;
		if(checkAnswer(guess)==false) 
			level = 1;
		
		System.out.println("Level " +level);
		
		if (level>10) 
			System.out.println("Wow! you beat level 10!\n You win!");

		return level;
	}
	public static char createPattern(int x, String guess, int level) {
		int num = 0;
		pattern.clear();

		for(int i = 0; i <= levelNum(level,guess); i++) {
			num = (int) (Math.random()*122)+97;
			pattern.add((char) num);
		}

		return (char)num;
	}

	public static void printPattern() throws InterruptedException{
		for (int i = 0; i <pattern.size(); i++){
			System.out.println (pattern.get(i));
			Thread.sleep(1000);
		}

	}
	public static String getAnswer(String guess) {
		Scanner sc = new Scanner (System.in);
		System.out.println("your guess:");
		guess = sc.next();
		sc.close();
		return guess;
	}
	public static boolean checkAnswer(String guess) {
		for(int i = 0; i < pattern.size(); i++) {
			if(guess.charAt(i)!=pattern.get(i)) 
				return false;	
		}
		return true;
	}
}
