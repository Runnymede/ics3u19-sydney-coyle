package coyle.unit1;

/**
 * AboutMe.java
 * This is a program displays my personal information and a team cheer for my school
 * September 18, 2019
 * @author Sydney Coyle
 */
public class AboutMe {

	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main (String[]args) {

		System.out.println("Sydney C");
		System.out.println("Ms.Kemp");
		System.out.println("Runnymede CI");
		System.out.println("\"Go Ravens Go!!\"\n\n");



		System.out.format("%-14s %-14s %-7s","Period", "Day 1", "Day 2\n\n");
		System.out.format("%-14s %-14s %-10s","Period 1", "SPH3U1-01", "SPH3U1-01\n");
		System.out.format("%-14s %-14s %-7s","08:45", "Enns,M.", "Enns,M.\n");
		System.out.format("%-14s %-14s %-3s","10:02", "226", "226\n\n");

		System.out.format("%-14s %-14s %-10s","Period 2", "PAF3OF-01", "PAF3OF-01\n");
		System.out.format("%-14s %-14s %-12s","10:07", "ZZteacher,A.", "ZZteacher,A.\n");
		System.out.format("%-14s %-14s %-4s","11:24", "W.R", "W.R\n\n");

		System.out.format("%-5s","Lunch\n");
		System.out.format("%-5s","11:24\n");
		System.out.format("%-5s","12:26\n\n");

		System.out.format("%-14s %-14s %-10s","Period 3", "ICS3U3-02", "AWQ3M1-01\n");
		System.out.format("%-14s %-14s %-10s","12:26", "Kemp,C.", "Lambert,A.\n");
		System.out.format("%-14s %-14s %-4s","13:43", "024", "025");

		System.out.format("%-14s %-14s %-12s","Period 4", "ICS3U3-02");
		System.out.format("%-14s %-14s %-7s","12:26", "Lambert,A.", "Kemp,C.\n");
		System.out.format("%-14s %-14s %-4s","13:43", "025", "024");

	}

}
