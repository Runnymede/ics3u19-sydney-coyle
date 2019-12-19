package coyle.unit4;

import java.util.Scanner;

/**
 * TemperatureConverter.java <br>
 * Converts temperature from fahrenheit to celsius and vice versa<br>
 * December 18, 2019
 * @author Sydney Coyle
 */

public class TemperatureConverter {

	/** 
	 *Entry to the program
	 *@param temp2 unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int temp;
		System.out.println("celsius to fahrenheit or fahrenheit to celsius");
		String conversion = sc.nextLine();
		
		if (conversion.equalsIgnoreCase ("fahrenheit to celsius")) {
			System.out.println("Enter a temperature in fahrenheit");
			temp = sc.nextInt();
			fahrenheitToCelsius(temp);
		}
		
		else {
			System.out.println("Enter a temperature in celcius");
			temp = sc.nextInt();
			celsiusToFahrenheit(temp);
		}
		sc.close();
	}

	public static void fahrenheitToCelsius(int temp) {
		int c = (temp - 32) * 5 / 9;
		System.out.println(c);
	}
	
	public static void celsiusToFahrenheit(int temp) {
		int f = temp * 9 / 5 + 32;
		System.out.println(f);
	}
}
