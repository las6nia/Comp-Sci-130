package assignment2;
import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) { //start of main method
		
		char userInput;
		char userChoice;
		
		System.out.print("Enter if business or residential: ");
		userInput = input.next().toLowerCase().charAt(0);
		
	while (userInput = 'r' || userInput =='b') {
	if (userInput == 'r' || userInput == 'b')  {
		System.out.println("this is the methid called");
		//this is where the options and calculations will go once bill and calculate amount will go
		
		System.out.println("Please select an option: ");
		menuDisplay(userChoice = input.next().toLowerCase().charAt(0));
	//Average cost per day (30 billing days) - it could be either method or on main
	//Mark's part of the code?? 
		double amountDue = 0;//Get Nums
		System.out.printf("Amount due = $%.2f", amountDue);
		
		
		
	}
	else {
		System.out.println("Not business or residential");
	}
	
	
		} //end of while
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//start of menuOption()
	public static char menuDisplay(char userInput) {
		char i;
		char v;
		char e; //exit option
		System.out.print("I - Enroll in our installment plan\n");
		System.out.print("V - view change in consumption: Compare your current bill with your\nprevious one\n");
		System.out.print("E - Exit");
		
		while (userInput == 'i') {
			if (userInput == 'i') {
				System.out.println("************************************");
				System.out.print("If you do not want to make a onetime payment, we have an easy\ninstallment plan for you. This is an ineterest charge plan.\nSign up for the Installment Payment Plan (y/n) ?\n");
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
	
	// residentialBill() method - lin's code: 
	public static double ResidentialBill ()
	{
		double KWH;
		double fee;
		
		System.out.print("Welcome Residential Customer,\n Enter the total usage KiloWatt Hours (KWH): \n");
		KWH = input.nextDouble();
		
		fee = KWH * 0.12 + 8.07;
		fee = fee + fee * 0.05;
		
		return fee;
	}
	
	//businessBill() method - Lin's code:
	public static double BusinessBill ()
	{
		double KWH;
		double fee;
		int  premiumChannels;
		
		System.out.print("Welcome Business Customer,\n Enter the total usage KiloWatt Hours (KWH): \n");
		KWH = input.nextDouble();
		System.out.print("Enter the number of premium channels used: \n");
		premiumChannels = input.nextInt();
		
		if (KWH <= 1200)
		{
			fee = KWH * 0.17 + 47 * premiumChannels + 17.07;
		}
		
		else
		{
			fee = 204 + (KWH-1200) * 0.12 + 47 * premiumChannels + 17.07;
		}
		fee = fee + fee * 0.08;
		
		
		return fee;
	}
	
	
	
	
	
	
}
