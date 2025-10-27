package Lab4;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Lab 4 - Sentinel- controlled iterations
		//Coin sorter
		
		String coins;
		double q = .25; //quarter
		double d = .10; //dime
		double n = .05; //nickle
		double p = 0.1; //penny
		
		int qCounter = 0;
		int dCounter = 0;
		int nCounter = 0;
		int pCounter = 0;
		
		int counter = 0;
		
		System.out.print("Enter the coin code:\n");
		coins = input.nextLine();
		coins = coins.toLowerCase();
		int index =0;
		int undefinedCoins= 0;
		
	while(index <= coins.length()-1) {
		char copy = coins.charAt(index);
		if (index == copy){
			while (index>=0) {
				if (copy == 'q') {
				System.out.print("Q test");
				q+=q;
				qCounter++;
				}
				else if (copy == 'd') {
					System.out.print("d Test");
					d+=d;
					dCounter++;
					}
				else if (copy == 'n') {
					System.out.print("n Test");
					n+=n;
					nCounter++;
					}
				else if (copy == 'p') {
					System.out.print("p Test");
					p+=p;
					pCounter++;
					}
				else {
					System.out.print("Enter a valid Syntax");
					break;
				}
			}
			
		}
		else {
			System.out.print("Enter a valid syntax");
			undefinedCoins+=undefinedCoins;
			continue;
		}
		
		counter++;
		System.out.print("Enter the coin code:\n");
		coins = input.nextLine();
		
		
		}
	double add = (qCounter*q)+(nCounter*n)+(dCounter*d)+(pCounter*p);
	
		System.out.printf("\nCoin counts:\n");
		System.out.print('-'*5);
		System.out.printf("\nPennies: %d",p);
		System.out.printf("\nNickles: %d",n);
		System.out.printf("\nDimes: %d",d);
		System.out.printf("\nQuarters: %d\n",q);
		System.out.println('-'*5);
		System.out.printf("TOTAL VALUE: %.2f", add);
		System.out.printf("Number of unidentified coins: %.2f", undefinedCoins);
		
	}

}
