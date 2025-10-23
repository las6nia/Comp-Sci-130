package Labs;
import java.util.Scanner;



public class Lab4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String userInput;
		double q = .25; //quarters
		double d = .10; //dimes
		double n = .5; //nickle
		double p = .1; //pennies
		
		int quarterCounter = 0;
		int dimeCounter = 0;
		int nickleCounter = 0;
		int pennieCounter = 0;
		
		double totalValue = 0;
		int notACoin = 0;
		int coinCount = 0;
		
		
		System.out.print("Enter coin code: \n");
		userInput = input.nextLine();
		userInput = userInput.toLowerCase();
		
		int index  = userInput.length()-1;
		char copy = userInput.charAt(index);
		
		while (index <= 0) {
			//get a copy of the character indexed by the current index
			//Note to self = try to find the correct logic to get the reverse input read, if user = char, maybe convert to char
			if (userInput.charAt(index) == 'q') {
				q+= q;
				totalValue += q;
				
			}
			else if (userInput.charAt(copy) == 'd'){
				d+=d;
				totalValue += d;
			}
			else if (userInput.charAt(copy) == 'n'){
				n+=n;
				totalValue += n;
			}
			else if (userInput.charAt(copy) == 'p'){
				p+=p;
				totalValue += p;
			}
			else {
				notACoin++;
			}
		coinCount++; //after each loop this coint counter will count how many times it has gone through the loop
		
	//cointCount = 
	//totalValue = // add the value of each increment as we go through the iterations
	//notACoin = 
		
		}
		
		System.out.print("Coin Count: %.1f\n");
		System.out.print("-".repeat(20));
		
		
		System.out.print("\nPennies: %.2f\nNickles: %.2f\nDimes: %.2f\nQuarters: %.2f\n");
		
		System.out.print("-".repeat(20));
		System.out.print("\nTOTAL VALUE: $%.2f\n");
		System.out.printf("Number of unidentified coins: %.2f", notACoin);
		

	}

}
								
