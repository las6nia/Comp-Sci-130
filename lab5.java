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
		
		
	double totalReceipts = 0;
        double hours;

        System.out.print("Enter number of hours (a negative to quit): ");
        hours = input.nextDouble();

        while (hours >= 0) {

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.printf("Current charge: $%.2f, Total receipts: $%.2f\n", charge, totalReceipts);

            System.out.print("Enter number of hours (a negative to quit): ");
            hours = input.nextDouble();
        }
    }

    // Calculates the parking charge for one customer
    public static double calculateCharges(double hours) {
        double baseRate = 2.00;
        double charge;

        if (hours > 3) {
            charge = baseRate + 0.50 * (hours - 3);
            if (charge > 10.00) {
                charge = 10.00; // Max $10 per 24 hours
            }
        } else {
            charge = baseRate;
        }

        return charge;
    }

	}
	
		
}
