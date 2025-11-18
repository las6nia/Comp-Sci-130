
package myPackage;

import java.util.Scanner;

public class mainClass {// start of main
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { // start of the main class
		int[] test1 = { -2, 4, 7, 10, 9 }; // First array
		double[] test2 = { 3.14, 5.27, -9.8, 11.2, 17 }; // second array
			
		int[] list1 = new int[5];
		char[] list2 = new char[4];
		
		//task 3 - display all elements (values) of test 1
		System.out.println("test 1: ");
		ArrayMethods.displayArray(list1);
		
		//redo task 4 display
		System.out.println("test 2: ");
		ArrayMethods.add10ToArray(test2);
		
		//Task - redo t5 using the developed methods, that adds 10 to every element of test1 and redisplaying test1
		System.out.println("\ntask 5 load array: ");
		ArrayMethods.loadArray(test1);
		System.out.println("display array: ");
		ArrayMethods.add10ToArray(test1);
		
		
		//write code that reads 5 integers from user and store them into list1
		
		//redo 3 for list 2
		
		//Display list2
		
		

	}// end of Main Class

}// end of class
