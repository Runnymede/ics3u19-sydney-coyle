package coyle.unit4;


import java.util.Scanner;
/**
 * MathPlus.java <br>
 *  <br>
 * January 06, 2020
 * @author Sydney Coyle
 */

public class MathPlus {

	/** 
	 *Entry to the program
	 *@param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		//asking for number of integers in array
		System.out.println("How many integers do you want to print");
		int numInt = sc.nextInt();
		int[] num = new int[numInt];

		//asking for each integer
		System.out.println("Enter the " +numInt+" integers one by one");
		for (int i = 0; i<numInt; i++) 
			num[i] =  sc.nextInt();
		sc.close();

		//Integer outputs
		System.out.println("the minimum number is at index " +min(num));
		System.out.println("the maximum number is at index " +max(num));
		System.out.println("the sum of all the numbers is " +sum(num));
		System.out.println("the average of all the numbers is " +average(num));
		System.out.println();

		//double outputs
		System.out.println("the minimum number is at index " +min(num));
		System.out.println("the maximum number is at index " +max(num));
		System.out.println("the sum of all the numbers is " +sum(num));
		System.out.println("the average of all the numbers is " +average(num));
		System.out.println();
	}

	/** 
	 *This method returns the index of the first occurrence 
	 *of the smallest number in the array
	 *@param num 
	 *@return the index of the first occurrence of the smallest number in the array
	 */
	public static int min(int num[]) {
		int small =0;
		for (int i=1; i<num.length; i++) {
			if (num[i] < num[small])
				small = i;
		}
		return small;
	}

	/** 
	 *This method returns the index of the first occurrence 
	 *of the largest number in the array
	 *@param num 
	 *@return the index of the first occurrence of the largest number in the array
	 */
	public static int max(int num[]) {
		int big = 0;
		for (int i=1; i<num.length; i++) {
			if (num[i] > num[big])
				big = i;
		}
		return big;
	}

	/** 
	 *This method returns the sum of all the integers in the given array
	 *@param num 
	 *@return the sum of all the integers in the given array
	 */
	public static int sum(int num[]) {
		int add = num[0];
		for (int i=0; i<num.length-1; i++) {
			add += num[i+1];
		}
		return add;
	}

	/** 
	 *This method returns the average of all the integers in the given array
	 *@param num 
	 *@return the average of all the integers in the given array
	 */
	public static int average(int num[]) {
		int averageNum = sum(num)/ num.length;
		return averageNum;

	}
	/** 
	 *This method returns the index of the first occurrence 
	 *of the smallest number in the array
	 *@param num 
	 *@return the index of the first occurrence of the smallest number in the array
	 */




	//double integers

	public static int min(double num[]) {
		int small =0;
		for (int i=1; i<num.length; i++) {
			if (num[i] < num[small])
				small = i;
		}
		return small;
	}

	/** 
	 *This method returns the index of the first occurrence 
	 *of the largest number in the array
	 *@param num 
	 *@return the index of the first occurrence of the largest number in the array
	 */
	public static int max(double num[]) {
		int big = 0;
		for (int i=1; i<num.length; i++) {
			if (num[i] > num[big])
				big = i;
		}
		return big;
	}

	/** 
	 *This method returns the sum of all the integers in the given array
	 *@param num 
	 *@return the sum of all the integers in the given array
	 */
	public static double sum(double num[]) {
		double add = num[0];
		for (int i=0; i<num.length-1; i++) {
			add += num[i+1];
		}
		return add;
	}

	/** 
	 *This method returns the average of all the integers in the given array
	 *@param num 
	 *@return the average of all the integers in the given array
	 */
	public static double average(double num[]) {
		double averageNum = sum(num)/ num.length;
		return averageNum;

	}

}
