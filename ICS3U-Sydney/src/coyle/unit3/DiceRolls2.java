package coyle.unit3;
/**
 * DiceRolls.java <br>
 * rolls two dice and finds the total 1000 times
   counts how many times each total is rolled <br>
 * November 27, 2019
 * @author Sydney Coyle
 */
public class DiceRolls2 {
	/**
	 * Entry point to the program
	 * @param args
	 */ 
	public static void main(String[]args) {

		//variables
		int die1 = 0;
		int die2 = 0;
		int total = 0;
		int[] rollNum = {0,0,0,0,0,0,0,0,0,0,0,0,0};

		//titles
		System.out.format("%8s", "Total");
		System.out.format("%19s", "Number of Rolls\n");

		//random die values
		for (int i = 2; i<=1000; i++) {
			die1 = (int)(Math.random()*6)+1;
			die2 = (int)(Math.random()*6)+1;
			total = die1 + die2;

			//output	
			if (i<=12)
			System.out.format("%8s", i);
			
			if (total ==2)
				rollNum[0]++;
			
			else if (total ==3)
				rollNum[1]++;
			
			else if (total ==4)
				rollNum[2]++;
			
			else if (total ==5)
				rollNum[3]++;
			
			else if (total ==6)
				rollNum[4]++;
			
			else if (total ==7)
				rollNum[5]++;
			
			else if (total ==8)
				rollNum[6]++;
			
			else if (total ==9)
				rollNum[7]++;
			
			else if (total ==10)
				rollNum[8]++;
			
			else if (total ==11)
				rollNum[9]++;
			
			else if (total ==12)
				rollNum[10]++;
			
			System.out.format("%16s",rollNum[i]);
			System.out.println();
			
		}
	}
}
