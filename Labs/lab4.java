package Lab4;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Lab 4 - Sentinel- controlled iterations
		//Coin sorter	
		
		//Good things - passes case 1 and 2 but not case 3
		String coins;
		double q = .25; //quarter
		double d = .10; //dime
		double n = .05; //nickle
		double p = 0.01; //penny

		int qCounter = 0;
		int dCounter = 0;
		int nCounter = 0;
		int pCounter = 0;
		
		int undefinedCoin = 0;
		int counter = 0;
		

		System.out.print("Enter the coin code: \n");
		coins = input.nextLine();
		coins = coins.trim().toLowerCase(); //should I add trim to remove spaces??
		int index =0;
		int undefinedCoins= 0;
		
	while(index <= coins.length()-1) {
		char copy = coins.charAt(index);
		switch (copy) {
			case ('q'):
				qCounter++;
				break;
			case ('d'):
				dCounter++;
				break;
			case ('n'):
				nCounter++;
				break;
			case ('p'):
				pCounter++;
				break;
			case ('x'):
				break;
			default:	
				undefinedCoins++;
				break;
				}
		
		index++;
	}

		double add = (qCounter*q)+(nCounter*n)+(dCounter*d)+(pCounter*p);


		System.out.printf("Coin counts:\n");
		System.out.print("-".repeat(10));
		System.out.printf("\nPennies: %d",pCounter);
		System.out.printf("\nNickles: %d",nCounter);
		System.out.printf("\nDimes: %d",dCounter);
		System.out.printf("\nQuarters: %d\n",qCounter);
		System.out.println("-".repeat(10));
		System.out.printf("TOTAL VALUE: $%.2f",add); //,add
		System.out.printf("\nNumber of unidentified coins: %d",undefinedCoins); //,undefinedCoins);
		
	
	}

}
