package Lecture20;
import java.util.Scanner;

public class lecture20 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
										//Arrays
	//Task 1: write a code to do the below task = create an array named tester1 that can store  
	//The following value, values: -2,4,7,10,9
		
		int [] test1= {-2,4,7,10,9}; //First array
		//task 2: do test2  with double values
		double [] test2 = {3.14,5.27,-9.8,11.2,17}; //second array 
		//we will process all values in the array, accesing every spot from index 0 to length()-1 - last
/*
		
							//Accesing every spot test1[#number]
		//We visit every index in our arrays
		System.out.print("Test 1: ");
		//task 3 - display all elements (values) of test 1
							//Careful to add index <=test1.length()-1 because the last index is not included in array.
		for (int index =0; index<test1.length; index++) {
			//at each index, display the value at that index
			System.out.printf("%d\t",test1[index]);
			
		}
		System.out.print("\nTest 2: ");
		//T4 = our own, we do the same for test 2
		for (int index =0; index<test2.length; index++) {
			System.out.printf("%.2f\t", test2[index]);
		}
		
		System.out.println();
		System.out.print("\nAdding 10\nTest 1: ");
		//task 5: create a code to add 10 to every element to test1
		for (int index = 0; index <test1.length; index++) {
			test1[index] += 10; //adding 10 to the value in index of array
			System.out.printf("%d\t", test1[index]);
			
		}
		System.out.println();
		System.out.print("\nAdding 10\nTest 2: ");
		
		//task 6: create a code to add 10 to every element to test2
		for (int index = 0; index <test2.length; index++) {
			test2[index] +=10;
			System.out.printf("%.2f\t", test2[index]);
		}
		
		//Teacher concern = we're repeating code over and over with very little changes
		//Other concern - the main method DOES ALL TASK
		//What can we do? We can create other methods that takes an array
		
											//Solution
		
		//write a void method that takes an array of integers as a paremeter and then it will display the context
		//of that taken array, called displayArray()
											//Uses
		//The main does tasks
		//The other methods do needed tasks

		
		
		//Task 7: Redo task 1 by using the method to display array: 
		System.out.print("Test 1 using method: ");
		displayArray(test1); //takenArray == test1 - this will travel down to displayArray - the main is using the second method
		
		//Instructor question: Can we use displayArray() to display test 2? no. we have double for test2
		//We can do overloading, same name and everything but have to change 
		
		//Task 8: Redo task 4 by using the method to display array:
		System.out.print("Test 2 using method: ");
		displayArray(test2); 
		
		//Task 9: write a method named add10toArray() that takes an integer arrays and then adds 10 to all in the array
		//Apply the overloading method so it works with int, double (and maybe others)
		System.out.print("Test 1 adding 10 method: ");
		add10ToArray(test1);
		System.out.print("\nTest 2 adding 10 method: ");
		add10ToArray(test2);
		
		//Task 10: redo task 5 using method
		System.out.println("\nTest 1 using displayArray(): ");
		displayArray(test1);
		
		//Task 11: redo task 6 using method
		System.out.println("Test 2 using displayArray(): ");
		displayArray(test2);
		*/							
								//NEW TOPIC = Arrays
		//How could we read values from the user and store them in array??
		//write a void method (done)
										//Loading arrays from the user
		//1 - create an empty array of integers named 'list1' tjay can store up to 5 values
		
		int [] list1 = new int[5]; // this creates a list with up to 5 integers
		
		//2 - Need to create an empty array of characters list2 that can store up to 4 values
		
		char [] list2 = new char[4];
		
		//3 - write a code that reads 5 values from the user and store them into list
		System.out.println("Enter 5 values for list 1: ");
		loadArray(list1);

		//display the inputed array for list1 - in method read:
		System.out.print("Your numbers are:\n");
		 displayArray(list1); //this will display the arrays
		
		//4 - redo #3 but for list 2 - these are double
		 System.out.println("Enter 5 values for list 2: ");
		loadArray(list2); //FIX TO HAVE DISPLAY
		System.out.print("Your numbers are:\n");
		 displayArray(list2); 
		
		 //Concern - Class means file
		 //The main class contains the main method and all other methods
		 
		 								//Instructor - Will show us how to make a library :))))!!!
		 
		
		
						
		
		
		
		
		

	}
	//Start of the 
	//To use array: (int [] a)
	//a single value: (int a)
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


}//Main Project /
