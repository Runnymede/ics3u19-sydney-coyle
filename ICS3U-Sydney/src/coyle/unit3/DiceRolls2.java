package coyle.unit2;
/**
 * DiceRolls.java <br>
 *  <br>
 * November 27, 2019
 * @author Sydney Coyle
 */
public class DiceRolls2 {
	/**
	 * Entry point to the program
	 * @param args
	 */ 
	public static void main(String[]args) {
		int die1 = 0;
		int die2 = 0;
		int total = 0;
		int[] rollNum = 

		System.out.format("%8s", "Die 1");
		System.out.format("%8s", "Die 2");
		System.out.format("%8s", "Total\n");

		for (int i = 1; i<=6; i++) {
			die1 = (int)(Math.random()*6)+1;
			die2 = (int)(Math.random()*6)+1;
			total = die1 + die2;

			System.out.format("%6s", die1);	
			System.out.format("%7s", die2);	
			System.out.format("%8s", total);
			System.out.println();
		}
	}
}
