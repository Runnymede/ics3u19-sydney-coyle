package Culminating;

import java.util.Scanner;
import java.util.ArrayList;


public class Simon {


	static ArrayList<Character> pattern = new ArrayList<Character>();
	static String guess;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Simon!\nIn this game, the computer will display a series of letters.");
		System.out.println("Your job is to type in the exact same letters in the exact same order.");
		System.out.println("If you get the pattern right you may move on to the next level.");
		System.out.println("However, if you get it wrong, you will be sent back to level 1.");
		System.out.println("Pass level 10 to win the game!");

		levelNum(guess);
		createPattern();
		printPattern();
		getAnswer(guess);
		checkAnswer(guess);
	}
	//
	public static int levelNum(String guess) {
		int level = 1;
		if(checkAnswer(guess)==false) 
			level = 1;

		System.out.println("Level " +level);

		if (level>10) 
			System.out.println("Wow! you beat level 10!\n You win!");

		return level;
	}
	//
	public static char createPattern() {
		int num = 0;
		pattern.clear();

		for(int i = 0; i <10; i++) {
			num = (int) (Math.random());
			pattern.add((char) num);
		}

		return (char)num;
	}
	//
	public static void printPattern() throws InterruptedException{
		for (int i = 0; i <pattern.size(); i++){
			System.out.println(pattern.get(i));
			Thread.sleep(1000);
		}

	}
	//
	public static String getAnswer(String x) {
		Scanner sc = new Scanner (System.in);
		System.out.println("your answer:");
		guess = sc.next();
		sc.close();
		return guess;
	}
	//
	public static boolean checkAnswer(String x) {
		for(int i = 0; i < pattern.size(); i++) {
			if(guess.charAt(i)!=pattern.get(i)) 
				return false;	
		}
		return true;
	}
}
