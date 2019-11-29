package coyle.unit3;

/**
 * HappyAndYouKnowIt.java <br>
 * Prints the lyrics to the song If You're Happy And You Know It <br>
 * November 25, 2019
 * @author Sydney Coyle
 */

public class HappyAndYouKnowIt {
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main(String[] args) {

		//variables
		String verse = "If your happy and you know it ";
		String[] actions = {"clap your hands", "stomp your feet","touch your toes",
				"Snap your fingers", "wiggle your toes", "touch your nose", "cover your eyes",
				"stick out your toung","raise your hands","scrunch you nose"};

		//loop for each stanza
		for (int i = 0; i <actions.length; i++) {

			//loop for each verse
			for (int j = 0; j <3; j++) {
				System.out.println(verse + actions[i]);
				if (j==1)
					System.out.println(verse + "and you really want to show it");
			}	
			//spaces
			System.out.println();
		}
	}
}