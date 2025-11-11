package lecture16;

import java.util.Scanner;

// Section 1: A list of import statements

public class Main { // Start of class

	// Section 2:
	// This is where the Scanner becomes global.
	static Scanner input = new Scanner(System.in); // Study what "static" means (OOP)

	// Section 3: Main method
	public static void main(String[] args) { // Start of the main method

		// Note: If we declare the Scanner object (example: input) inside the main
		// method (as we did before),
		// then this Scanner object cannot be used by other methods,
		// because a Scanner object declared inside main is local — only known by the main method.

		// Previously, we only worked with the main method (old style).
		// Starting from class 16 (11/4/25), we will use user-defined methods.
		// Our code will now be broken down into the main method plus other blocks of code,
		// where each block is considered a "user-defined method."

		// We still have the main method, but now we will also create and use our own methods.
		// (Finish notes from the picture.)

		// -----------------------------------------------------------------------

		// Change: We would like to declare the Scanner object as a global variable.
		// NOTE: If the variable is global, it is known by every method.
		// Therefore, we declare the object in Section 2!

		// -----------------------------------------------------------------------

		// A method:
		// - Performs a simple and specific task.
		// - Has a meaningful name (method name = task it performs).
		// - Has zero or more inputs (parameters).
		// - May or may not return an output value (called the "returned value").
		// - In Java, inputs are called parameters, and the output is called the returned value.
		// - We can represent a method using the "black box" concept:
		//   parameters --> [method name] --> returned value.

		// We don’t care what happens inside the "black box" (method body);
		// we only care about the result it returns.

		// -----------------------------------------------------------------------
		// Refresher:
		// A method follows this structure:

		// METHOD HEADER: (important)
		// <ACCESS MODIFIER> <TYPE OF RETURNED VALUE> <METHOD NAME>(PARAMETERS) {
		//     METHOD BODY
		// }

		// Example: Write the header for the pow method
		// static public   → access modifier
		// int             → type of returned value
		// pow             → method name
		// (x, y)          → parameters

		// -----------------------------------------------------------------------

		// Task 1: Make a method that allows the user to add two integers.
		// The method should take two integers as inputs and return the sum of these integers.
System.out.printf("12 / 78.5 = %.2f\n",dividingIntegers(12, 78.5)); //IMPORTANT: 12 is the ARGUMENT for the parameter i

// System.out.printf("12 / 78.5 = %.2f\n",dividingIntegers(12.5, 78.5)); //error on i, good on J
System.out.printf("12 / 78.5 = %.2f\n",dividingIntegers(12, 78)); //Good because error is double 78.0, or 78

		//Part1: develop a method named greetingPerson that takes the name of a person as a String and then it will
//Display a greeting message for the that person

		//part 2: In the main method, do the following:
	//Num1: read the name of the user, then pass thisName to the method greetingPerson(), to display a greeting
	//Message for him or her

/*
	//task 5: code
	System.out.print("Hello! Enter your name: "); //Output using 
	String greetingPerson;
*/
	double foot;
	double meter;
	System.out.print("Enter the foot: ");
	foot = input.nextDouble(); 
	
	System.out.print("Enter the Meter: ");
	meter = input.nextDouble(); 
	
	
	System.out.printf("The foot is %.2f", footToMeter(foot));
	System.out.printf("The meter is %.2f", footToMeter(meter));
		
	int meter = 20;
	for (int row = 1; row <=10; row++) { //table has 10 rows
		
		System.out.printf("%d %.3f %d ")
	}
	
	
	
	//Methods start: 
	}
	public static double footToMeter(double foot) {
		return 0.305 * foot; 
		
	}
	public static double meterToFoot(double meter) {
		return 3.279 * meter; 
		
	}
	
	//task 5: code method:
	public static void greetingPerson(String personName) { //Void because there is no expected output -
		System.out.print("Hello! Enter your name: ");
		personName = input.nextLine();	
		System.out.printf("Hello %s", personName);
	}

	// Task 1 solution
	static public int addIntegers(int x, int y) {
		// int sum = x + y;
		// return sum;

		return x + y; // Programmers often prefer this shorter form — no parentheses needed.
	}

	// Task 2: Write a method that takes 1 integer and 1 double value,
	// and returns the result of dividing the integer by the double.
	static public double dividingIntegers(int i, double j) {
		double result = i / j;
		return result; // Send back the obtained result to the part that calls this method.
	}

	// If the method has no output (return value), then we use 'void' as the type of return value.
	// We use 'void' when the method does not return anything.

	// Task 3: Write a method findSquare that takes an integer value
	// and returns the square of this input.
	public static int findSquare(int x) {
		return x * x;
	}

	// -----------------------------------------------------------------------
	// A method will only execute when it is called.
	// Calling statements pass values for the parameters.
	// Example of calling a method:
	// findSquare(userInput);

	// -----------------------------------------------------------------------

	// End of main
	// Section 4: The code for other user-defined methods (area where you define these methods).

} // End of class
