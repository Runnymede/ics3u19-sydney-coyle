package Culminating;

import java.util.ArrayList;


public class Simon {
	

	static ArrayList<Character> pattern = new ArrayList<Character>();
	
	public static void main(String[] args) {

	}
	
	public static char createPattern(int x) {
		int level= 1;
		int num = 0;
		pattern.clear();
		
		for(int i =0; i <=level; i++) {
			num = (int) (Math.random()*122)+97;
			pattern.add((char) num);
		}
			
		return (char) num;
	}
	
	public static void printPattern(int x) throws InterruptedException {
		for (int i= 0; i >=pattern.size(); i++){
			System.out.println (pattern.get(i));
			Thread.sleep(1000);
		
		}
	}
}
