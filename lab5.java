//Lab 5
package Labs;
import java.util.Scanner;

public class lab5 {
	static Scanner input = new Scanner(System.in); //static Scanner 

	public static void main(String[] args) {
		// $2.00 min fee for 3 hours
		//additional c.50 per hour after the 3 hours has passed
		
		//Maximun chrge for 24 hours is $10.00
		//Asume that no cars parks for longer than 24 hours at the time
		
		
					//Task - Write an application that calculates and displays the parking charges for
					//each customer who parked in the garage yesterday.
		
		
		double hours;
		System.out.print("Enter number of hours (a negative to quit): ");
		//int but I prefer float if 2.5 hours
		hours = input.nextDouble();
		boolean process = true;
		
		while (hours == hours) {
			if (hours <0) {
				process = false;
				break;
			}
			else {
				process = true;
				//Entry
				while (process && hours >0) {
					int count = 0; //Test if looping
					double newResult;
					double result = calculateCharges(hours); //catching the value
					
					System.out.printf("Current charge: $%.2f,", result);
					newResult = hours;
					
					System.out.printf("Total receipts: $%.2f", result);
					
					System.out.println("\nEnter number of hours (a negative to quit): ");
					//int but I prefer float if 2.5 hours
					double newHours = calculateCharges(input.nextDouble());
					
					newHours+= result;
					break;
					
				}
				
				
			}
		}
		
		
	
//method - calculateCharges (to do the calculations, get hours input here)
	
	}
	
	
	public static double calculateCharges(double hours) {
		
		if (hours <=3) {
			double result = hours * 2.00;
			return result;
		}

	}
	
		
}
