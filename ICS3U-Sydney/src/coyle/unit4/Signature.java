package coyle.unit4;

/**
 * Signature.java <br>
 * Prints my "ascii signature" using methods <br>
 * December 16, 2019
 * @author Sydney Coyle
 */

public class Signature {
	/** 
	 *Entry to the program
	 *@param args unused
	 */
	public static void main(String[] args) {
		//calling signature
		printSignature();

	}

	public static void printSignature() {
		//printing signature
		System.out.println("  .--.          .-.                     .--.             .-.");
		System.out.println(" : .--'         : :                    : .--'            : :");
		System.out.println(" `. `. .-..-. .-' :,-.,-. .--. .-..-.  : :    .--. .-..-.: :   .--.");
		System.out.println("  _`, :: :; :' .; :: ,. :' '_.': :; :  : :__ ' .; :: :; :: :_ ' '_.'");
		System.out.println(" `.__.'`._. ;`.__.':_;:_;`.__.'`._. ;  `.__.'`.__.'`._. ;`.__;`.__.'");
		System.out.println("        .-. :                   .-. :               .-. :");
		System.out.println("        `._.'                   `._.'               `._.'");
	}	
}