package bankAccountProgram;
import java.util.Scanner;
import java.util.Timer;
public class Main {
	public static Timer timer = new Timer();
	public static Scanner input = new Scanner(System.in); //public scanner

	public static void main(String[] args) {
		
		System.out.println("Welcome to National Bank"); //initital greet
		//enter timer library here!
		
		System.out.println("Enter your pin when possible: ");
		int pin = input.nextInt();
		String answer; 
		if (pin >=0) {
			boolean validPin = true;
			while (validPin) {
				boolean canProcess = true;
				int selection;
				int balance = 0;
				System.out.println("Enter your operation: ");
				System.out.println("[1]Check Balance: ");
				System.out.println("[2]Deposit");
				System.out.println("[3]Withdrawal");
				System.out.println("[4]Transfer"); //transfer from checking to savings or similar
				if (selection >=1 && selection <=4){
				switch (selection) {
				case 1:
				{
					System.out.printf("You have a balance of $%d", balance);
					break;
				}
				case 2:{
					int depositAmount = 0;
					System.out.print("Enter the amount you would like to deposit: ");
					depositAmount = input.nextInt();
					 if (depositAmount > 0 && depositAmount <1000) {
						 System.out.print("Do we need a deposit for todays transaction? y/n");
						 answer = input.nextLine(); 
						 //copy 
					 }
				}
					
				
				}
				}
				
			}
			
		}
		else {
			System.out.println("Invalid pin, try again later");
		}
		

	}

}
