package coyle.unit2;

/**
 * BlastOff.java <br>
 * counts down from 10 then prints blast off <br>
 * November 12, 2019
 * @author Sydney Coyle
 */

public class BlastOff {
	/**
	 * Entry point to the program
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[]args) throws InterruptedException {

		//count down
		for (int i = 10; i>=1; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		//blast off
		Thread.sleep(1000);
		System.out.println("Blast Off!");

	}
}