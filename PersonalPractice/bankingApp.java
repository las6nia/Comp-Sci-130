package bankAccountProgram;

import java.util.Scanner;
import java.util.Timer;

public class Main {
	public static Scanner input = new Scanner(System.in); // input scanner
	public static Timer timer = new Timer(); // timer

	public static int newBalance = 0; // starting value

	public static void main(String[] args) {
		int maxPinTries = 4;
		boolean isValid = false;

		System.out.print("Welcome to Wells Fargo!\n\nEnter your pin when possible or enter 'z\nPin: ");
		String pin = input.nextLine();

		if (pin.length() <= 4) {
			isValid = true;

			while (isValid) {
				transactionMenu(); // methid to options

			}

		} else if (pin == "Z" || pin == "z") {

			newCustomer();// call newCustomer() - method;

		} else {
			System.out.println("Try again next time...");

		}

	}

	// transaction method
	public static void transactionMenu () {
		int optionChoice;
		System.out.print("\n----Wells Fargo----\n");
		System.out.print("Enter your required option: \n");
		
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Transfer");
		System.out.println("4. Check Balance");
		
		optionChoice = input.nextInt(); //check integer value
		
		switch (optionChoice){
		case 1: 
			withdraw(); //money withdrawal
		
		case 2:{
			deposit(); //deposit
		case 3: {
			transfer(); //transfer
		}
		}
		default:
			break;
		}
		
		
		
		
	} // end of transaction Menu

	public static void withdraw() { // doing with int as i cannot do cents
		int withdrawAmount;
		newBalance = 0;
		System.out.print("Enter the amount that you would like to withdraw: ");
		withdrawAmount = input.nextInt();
		if (withdrawAmount >= 500) {
			System.out.print("Amount exceeds daily limit. Select a different amount: ");
			withdrawAmount = input.nextInt();

		} else {
			withdrawAmount = -newBalance; // have the balance withdrawn be the new updated balance
			System.out.printf("Thank you, your new balance is %d", newBalance);
		}

	} // end of withdraw amount

	public static void deposit() {
		return deposit;
	}

	public static void newCustomer() {
		String ssn; //should i change to string? 
		System.out.println("Enter your SSN: ");
		ssn = input.nextLine();

		checkSSN();

		// check SSN mehod

	}

	public static String checkSSN(String ssn) {
		boolean validSSN = false; //check ssn if valid
		
		if (ssn.length() < 12) { //check length
			//check first 3 
			System.out.print("invalid SSN, Try again later.");
			//if index at 0, 1, 2 ==is Number ==valid, continue, if index @ 3 == '-' is char ==valid, if next 3 are nums continue reading
		}
		
		return string;
	}

}
