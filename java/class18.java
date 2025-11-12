package lecture18;
import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in); //global - used everywhere
	
	public static void main(String[] args) { //start of main method
			//User defined methods 2 - In class Banking system project 
		//We will be doing a bank menu, we will be using a separate method
		
		double currentAccountBalance = 0; //Balance, initialization of account
		char userChoice; //user input
		// The program must continue running until the user chooses to exit. while loop to keep running (sentinel condition)
		//Recall the structure of this loop
		//1: reading the first input, while (iinput != sentinel value)
		//2: read the next input
				//my stuff code
		
		
		
		displayMenu();
		System.out.print("Enter your choice: ");
		userChoice = input.next().charAt(0);
		
		while (userChoice !='E' &&  userChoice != 'e') 
		{//start of while input
			switch(userChoice) 
			{
			case 'd': case 'D':
				//perform deposit action
				currentAccountBalance = deposit(currentAccountBalance); //catch this balance, this will send the updated balance 
				
				break;
			case 'w': case 'W':
				//perform withdrawing action
				currentAccountBalance = withdraw(currentAccountBalance);
				break;
			case 'c': case 'C':
				//perform check balance action
				checkBalance(currentAccountBalance); //checking the balance
				
				break;
			case 's': case 'S':
				//perform show rate of change action by calling the method (function)
				rateOfChange(currentAccountBalance);
				break;
				default: 
			System.out.printf("\n%c is an invalid input, try again\n", userChoice);
				
				
			
			}
						
			
			
			
			System.out.print("\n");
			displayMenu();
			System.out.print("Enter your choice: ");
			userChoice = input.next().charAt(0);
		} //end of while input
		
		System.out.print("Thank you for using our banking system. Goodbye!");
		
		
		
				
		
		
		
		
		
		
		
		

	} //end of main
	
	// -	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	
	//Note: Tru to always write a clear documentation what every method does, testing team
	public static void displayMenu(){ //start of second method to display the menu
		
		System.out.println("===== Green Bay Bank Menu =====");
		System.out.println("D: Deposit Money");
		System.out.println("W: Withdraw Money");
		System.out.println("C: Check Balance");
		System.out.println("S: Show Rate of Change");
		System.out.println("E: Exit");
		
		

	}//end of second method

	// -	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	
	//start of deposit method - allows the user to deposit money into their account:
	/*Details:
					• Prompts the user for the amount to deposit.
					• Adds the amount to the current balance if it’s positive.
					• Displays the new balance.
					• Returns the updated balance.
					Example Call: balance = deposit(balance);
 */
	public static double deposit(double balance){ //the methods take the current balance as input
		double amountToDeposit; //user input
		System.out.println("Enter the amount to deposit: ");
		amountToDeposit = input.nextDouble();
		
		// Adds the amount to the current balance if it’s positive.
		if (amountToDeposit > 0) 
		{
			balance += amountToDeposit;
			//display new balance
			System.out.printf("Deposit Sucessful! New Balance %.2f\n", balance);
		
		}
		else 
		{
			System.out.printf("Deposit operation cannot be performed due that %.2f is an invalid amount\n", amountToDeposit);
			
		}
		// • Returns the updated balance.
		return balance;
		
	}
	
	
	// -	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	
	// Method 3: Withdrawal amount - withdraw(double balance)
	/*Purpose: Allows the user to withdraw money from their account.
							Details:
							• Prompts the user for the amount to withdraw.
							• Checks that the amount is positive and less than or equal to
							the balance.
							• Subtracts the amount from the balance if valid; otherwise,
							shows an error message.
							• Returns the updated balance.
							Example Call: balance = withdraw(balance);
	 
	*/
	public static double withdraw(double balance) //current balance
	{
		double amountToWithdraw;
		System.out.println("Enter the amount to withdraw: ");
		amountToWithdraw = input.nextDouble();
		
		if (amountToWithdraw > 0) 
		{
			balance -=amountToWithdraw; 
			System.out.printf("Withdrawal Sucessful! New Balance %.2f\n", balance);
			
		}
		else 
		{
			System.out.printf("Deposit operation cannot be performed due that %.2f is an invalid amount\n", amountToWithdraw);
		}
		return balance;
	
	}
	
	// -	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	

	public static void checkBalance(double balance) //void - nothing to do
	{
		System.out.printf("\n⚠️Current balance: %.2f\n", balance);
	}

	// -	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-
	//rate of change formulaL: 
								/*Purpose:
							Calculates and displays the rate of change in the account balance
							compared to the balance from the previous month.
							Details:
							• Prompts the user to enter their last month’s balance.
							• Calculates the rate of change using the formula:
							Rate of Change (%) =
							Current Balance − Last Month’s Balance
							Last Month’s Balance
							× 100
							• Displays whether the balance increased or decreased, and by
							what percentage.
							• If the last month’s balance entered is zero or negative,
							display an error message.
							• Returns nothing (void method).
							Example Call: rateOfChange(balance);
	 * */
	public static void rateOfChange(double balance) 
	{
		double lastMonthBalance = 0;
		double rateOfChange;
		//Correct
		System.out.printf("Enter last month balance: ");
		lastMonthBalance = input.nextDouble();
		if (lastMonthBalance >0) { //needs a valid input
			rateOfChange = ((balance - lastMonthBalance) / lastMonthBalance) * 100;
			if (rateOfChange >0) {
			System.out.printf("\nYour balance increased by %.2f%%", balance);
			}
			else if (rateOfChange < 0 ) {
				System.out.printf("\nYour balance decreased by %.2f%%", Math.abs(rateOfChange));  //If negative : display abs (absolute value of the )
			}
			else {
				System.out.printf("\nYour balance of %.2f%% did not change ", balance);
			}
		}
		
		
	}
	
	
	
	// -	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-	-





}
