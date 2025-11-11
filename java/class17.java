package lecture17;

import java.util.Scanner;

public class MainClass17 {

	// global scanner
	static Scanner input = new Scanner(System.in); // global to use everywhere

	// Section 3: main method
	public static void main(String[] args) { // start of the main
//Slide 18: 
		// task 1: Programming exercise #2 - build method in section 4 - write a method
		// that displays the grade

		System.out.print("Enter your score: ");
		int score = input.nextInt();
		printGrade(score); // the value is argument

		// Task 2 - count the letters of a string

		System.out.print("Enter your string: "); // string
		String userInput = input.nextLine();

		int numOfLetters = countLetters(userInput);
		System.out.printf("You have %d in %s", numOfLetters, userInput);

		// Passing arguments by value = in an original int we do not touch the original
		// value, all changes are done inside of the method defined
		// Back from method 4:

		int myNum = 10;
		System.out.printf("\nBefore calling the method addThree: %d\n", myNum);
		// pass the value of myNum as argument to the method addThree;
		int result = addThree(myNum);
		System.out.printf("The value after addThree is: %d", result);
		System.out.printf("\nThe value of myNum: %d", myNum);

		// 3 - Scope:
		// Two major types of variables: global variables: variables are known
		// everywhere. To make a variable global,
		// Declare it outside of any method
		// A local variable = Only known inside the method where we declare it
		// Can skip slide 24

		//QUESTION: 
		
		//How can java make a decision? they can make decisions based on the arguments
		//Task: Try calling the overloaded methods
		
		addNums(10,23); //we are calling the one that takes 2 integers - int type
		addNums(10.25,23.4); //we are calling the one that takes 2 doubles- double type
		addNums(10,23, 2);//we are calling the one that takes 3 integers that are int type
		//addNums(10); //error, none have this condition
		addNums(10, 20.3); //Java will do auto-casting for this as int is part of double
		addNums(12,24.5,20); //Java will not offer auto-cast from double to int, as you have (int, double, int)
		addNums('A','B'); // this doesn't have error but this can have value as it turns the chars from char to int in ASCII value
		addNums(true, false); //Java doesn't have value for boolean in ASCII - error
		
		
		
		
		

	} // end of the main - - - - - - - - -- - - -- - - --- - - -- - - - -- - - - - --- - - -- - - -- - - --- - - -- - - - -- - - - - --
		// - -
		// section #4 = code for other methods (userDefinedMethods (or known as
		// functions))
//What does void??

	public static void printGrade(int score) { // start of method

		if (score >= 90) {
			System.out.printf("The grade for the score %d is A\n", score);

		} else if (score >= 80 && score <= 89) {
			System.out.printf("The grade for the score %d is B\n", score);
		} else if (score >= 70 && score <= 79) {
			System.out.printf("The grade for the score %d is C\n", score);
		} else {
			System.out.printf("The grade for the score %d is D\n", score);
		}

	}// end of method

	public static int countLetters(String s) { // change from void to int, because we're getting a value???? study!
		int count = 0;
		for (int index = 0; index < s.length() - 1; index++) {
			char copy = s.charAt(index);
			if (Character.isLetter(copy) == true) {

				count++;
			}
		}

		return count;
	}// end of second method

	// method 3:
	// write a method that takes an integer and then if this integer is a positive,
	// it will return the square root of it, multiplied by 5
	// otherwise, the method returns 0
	public static double methodA(int x) { // we have error if just return, answer to fix: we do not have answer for the
											// else
		if (x > 0) {
			return 5 * Math.sqrt(x);
		} else {
			return 0;
		}

	}// end of third method

//task = convert the above printgrades as a non-void, every path has its own statement!!!
	public static char printGradev2(int score) { // start of method
		if (score >= 90) {
			return 'A';

		} else if (score >= 80 && score <= 89) {
			return 'B';
		} else if (score >= 70 && score <= 79) {
			return 'C';
		} else {
			return 'D';
		}

	}// end of method

	// Write method named addthree that takes the integer and will add 3 without
	// affecting original

	public static int addThree(int n) {
		n += 3;
		return n;
	}// end of method 4

	// method 5:
	// we have a method named addNums that takes 2 integers and then display their
	// sum of the taken values
	public static void addNums(int num1, int num2) { // this method uses integers
		System.out.printf("Welcome to add numbers, takes 2 integers: %d + %d +%d +%d", num1, num2, num1, num2);
		// You cannot use the same methods, they're the same
	}

	// Method of OVERLOADING
	public static void addNums(double num1, double num2) { // this one takes double -This case is called overloading
		System.out.printf("Welcome to add numbers, takes 2 integers: %.2f + %.2f +%.2f +%.2f", num1, num2, num1, num2);
	}

	// Write method named addthree that takes 3 integers now:
	public static void addNums(int num1, int num2, int num3) { // OVERLOADING CASE AGAIN
		System.out.printf("Welcome to add numbers, takes 2 integers: %d + %d +%d +%d, +%d, +d", num1, num2, num1, num2,
				num1, num3);
		// You cannot use the same methods, they're the same
	}

}
