package MyVersion;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pin;
		double amount;
		
		
		System.out.print("Enter your PIN please: ");
		pin = input.nextInt();
		
		while (pin < 1){
			System.out.print("Invalid PIN: ");
			System.out.print("\nEnter your PIN please: ");
			pin = input.nextInt();
			if (pin == pin){
				System.out.print("Enter the amount to be withdrawn: ");
				if (amount > 500 || amount <1){
					
					
				}
				
			}
		}
		


	}

}
