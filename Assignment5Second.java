package assignment2;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char userInput;
		char userChoice;
		
		System.out.print("Enter if business or residential: ");
		userInput = input.next().charAt(0); //will it work with lowerCase?
		
		
	if (userInput == 'r' || userInput == 'b')  {
		System.out.println("this is the methid called");
		//this is where the options and calculations will go once bill and calculate amount will go
		
		System.out.println("Please select an option: ");
		menuDisplay(userChoice = input.next().toLowerCase().charAt(0));
	
		
		
		
	}
	else {
		System.out.println("Not business or residential");
	}
	
	
	}
	//start of menuOption()
	public static char menuDisplay(char userInput) {
		char i;
		char v;
		char e; //exit option
		System.out.print("I - Enroll in our installment plan\n");
		System.out.print("V - view change in consumption: Compare your current bill with your\nprevious one\n");
		System.out.print("E - Exit");
		
		while (userInput == 'i' || userInput == 'v') {
			if (userInput == 'i') {
				System.out.print("You are enrolling into our monthly installment plan\n");
				//Call marks or lins method, opens door to method
				
				
			break;
			}
			else if (userInput == 'v') {
				System.out.println("You are viewing to change consumption with previoous bill\n");
				//Call marks or lins method, opens door to method / calculator
				break;
			}
			else {
				System.out.print("Option not valid, try again\n");
				//Exits program with Goodbye
				break;
			}
		}
		else {
			System.out.println("Goodbye");
			//Exits program with Goodbye
			break;
		}
		return userInput;
	}
}
