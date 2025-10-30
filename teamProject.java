package MyVersion;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean transaction = false;
		char response;
		int pin;
		double amount;
		int counter = 0;
		
		int tenBills = 0, fiveBills = 0, oneBills = 0;

		
		System.out.print("Enter your PIN please: ");
		pin = input.nextInt();
		if (pin > 0) {
			transaction = true;
		}
		//1 is a min pin

	while (transaction == true) {
			if (pin % 2 ==0) { //even customer - $1 fee charge
				System.out.print("Enter the amount to be withdrawn: ");
				amount = input.nextInt();
				if (amount >=1000 || amount <0){
					System.out.printf("Invalid amount: %.0f.\n",amount );
				}
				else if (amount % 5 == 0 && amount < 1000){
					System.out.printf("You are a type 2 customer, but the amount you requested was %.0f.\n", amount);
					System.out.printf("You will be charged $1 for changing your default setting.\n");
					System.out.printf("Do you want to be charged $1?");
					response = input.next().charAt(0); //Come back for possible char error	

					if (response == 'y' || response =='Y') {
						if (amount >= 10) {
							amount = amount % tenBills;
						}
						if (amount >= 2 && amount<=5) {
							amount = amount % fiveBills;
						
						}
						if (amount == 1) {
							amount = amount % oneBills;
						
							}
						
						System.out.printf("You requested $%.1f\n", amount);
						System.out.printf("You have been charged $1.");
						System.out.printf("You are receiving the following bills: \n");
						System.out.printf("Number of $10 bils: %d\n", tenBills);
						System.out.printf("Number of $5 bils: %d\n", fiveBills);
						System.out.printf("Number of $1 bils: %d\n", oneBills);
						counter++;
						break; //fix this to ask again
						
						
							
						}
					if (counter>1) { //fix this
						break;
					}
						
						
					}
					else {
						break;
					}
			
			}
	}
	
	
	
	
	
	
	
	
	}
}
					
				
					
	
		
					
	

		
	


