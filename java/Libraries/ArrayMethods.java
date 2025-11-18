package myPackage;
import java.util.Scanner;
//this is my library that has a set of methods with work with arrays

public class ArrayMethods {//start of class
																		static Scanner input = new Scanner(System.in); //Scanner inside of the whole main
	public static void displayArray(int [] takenArray) { //a is a single value, if i put brackets 
		
		for (int index = 0; index <takenArray.length; index++) {
			System.out.printf("%d\t", takenArray[index]);
		}
		System.out.println();
	}
public static void displayArray(double [] takenArray) { //a is a single value, if i put brackets 
		
		for (int index = 0; index <takenArray.length; index++) {
			System.out.printf("%.2f\t", takenArray[index]);
		}
		System.out.println();
	}
public static void displayArray(char [] takenArray) { //using char
	
	for (int index = 0; index <takenArray.length; index++) {
		System.out.printf("%c\t", takenArray[index]);
	}
	System.out.println();
}
public static void displayArray(String [] takenArray) { //using string
	
	for (int index = 0; index <takenArray.length; index++) {
		System.out.printf("%s\t", takenArray[index]);
	
	System.out.println();
	}
}
public static void add10ToArray(int [] takenArray) { //adding 10 - int
	for (int index = 0; index <takenArray.length; index++) {
		takenArray[index]+=10;
		System.out.printf("%d\t", takenArray[index]);

	}
}
public static void add10ToArray(double [] takenArray) { //adding 10 - double
	for (int index = 0; index <takenArray.length; index++) {
		takenArray[index]+=10;
	System.out.printf("%.2f\t", takenArray[index]);
	}
}
									//Load Array Method - main does nothing 
//write a void method loadArray() that takes an array of integers as a parameter;
//and then it will prompt the user to insert values and it will store these values into that taken array
//Goal: read a set of values and store them into array

public static void loadArray(int [] takenArray) {
	for (int index = 0; index <takenArray.length; index++) {
		System.out.println("Enter an integer value: ");
		takenArray[index]= input.nextInt(); //first it will take from value and will add into the takenArray
		
	}
}

//overloading
public static void loadArray(double [] takenArray) {
	for (int index = 0; index <takenArray.length; index++) {
		System.out.println("Enter an integer value: ");
		takenArray[index]= input.nextDouble(); 
		
	}
}
public static void loadArray(char [] takenArray) {
	for (int index = 0; index <takenArray.length; index++) {
		System.out.println("Enter an integer value: ");
		takenArray[index]= input.next().charAt(0); 
		
	}
}
public static void loadArray(String [] takenArray) { //Strings Method
	for (int index = 0; index <takenArray.length; index++) {
		System.out.println("Enter an integer value: ");
		takenArray[index]= input.next(); 
		
	}
}


} //end of this class
